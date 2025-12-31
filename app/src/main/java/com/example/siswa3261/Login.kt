package com.example.siswa3261

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val edt_nis: EditText = findViewById(R.id.edt_nis)
        val edt_password: EditText = findViewById(R.id.edt_password)
        val btn_login: Button = findViewById(R.id.btn_login)
        btn_login.setOnClickListener {

            val isi_nis = edt_nis.text.toString()
            val isi_password = edt_password.text.toString()

            val minta = Volley.newRequestQueue(this)
            val mintadata: StringRequest = object : StringRequest (
                Request.Method.POST,
                Backend().url_login,
                Response.Listener<String>{ response ->

                    val respon = JSONObject(response)
                    if (respon.getString("hasil")=="sukses"){

                        var session = getSharedPreferences("siswa", MODE_PRIVATE).edit()
                        session.putString("nis", respon.getJSONObject("data").getString("nis"))
                        session.putString("nama_siswa", respon.getJSONObject("data").getString("nama_siswa"))
                        session.putString("foto_siswa", respon.getJSONObject("data").getString("foto_siswa"))
                        session.commit()

                        val pindah: Intent = Intent (this, Dashboard::class.java)
                        startActivity(pindah)
                    } else {
                        val pindah: Intent = Intent (this, Login::class.java)
                        startActivity(pindah)
                    }
                },
                Response.ErrorListener {
                    Log.d("eekrorr", "bermasalah")
                }
            ) {
                override fun getParams(): MutableMap<String, String>? {
                    val bawaan: MutableMap<String, String> = HashMap()
                    bawaan.put("kode","amikomoke")
                    bawaan.put("nis", isi_nis)
                    bawaan.put("password_siswa", isi_password)

                    return bawaan
                }
            }
            minta.add(mintadata)


        }
    }
}