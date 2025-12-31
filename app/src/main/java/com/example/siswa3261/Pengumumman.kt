package com.example.siswa3261


import android.os.Bundle
import android.util.Log
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

class Pengumumman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pengumumman)

        var juduls: MutableList<String> = mutableListOf()
        var tanggals: MutableList<String> = mutableListOf()

        var lv_pengumumman: ListView = findViewById(R.id.lv_pengumumman)

        val minta = Volley.newRequestQueue(this)
        val mintadata: StringRequest = object : StringRequest (
            Request.Method.POST,
            Backend().url_pengumumman,
            Response.Listener<String>{ response ->
                val dataarray = JSONObject(response).getJSONArray("data")
                for (i in 0  until  dataarray.length()) {
                    val jdl = dataarray.getJSONObject(i).getString("judul_pengumuman")
                    val tgl = dataarray.getJSONObject(i).getString("tanggal_pengumuman")

                    juduls.add(jdl)
                    tanggals.add(tgl)
                }
                var perulangandata = Pengumumman_item(this, juduls, tanggals)
                lv_pengumumman.adapter = perulangandata
            },
            Response.ErrorListener { error ->
                Log.d("eekrorr", "bermasalah")
            }
        ) {
            override fun getParams(): Map<String, String>? {
                val bawaan: MutableMap<String, String> = HashMap()
                bawaan.put("kode","amikomoke")

                return bawaan
            }
        }
        minta.add(mintadata)
    }
}