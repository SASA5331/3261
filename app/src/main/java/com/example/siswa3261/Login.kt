package com.example.siswa3261

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.siswa3261.R.*
import com.example.siswa3261.R.id.*

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(layout.login)

        val edt_nim: EditText = findViewById(edt_nim)
        val edt_password: EditText = findViewById(edt_password)
        val btn_login: Button = findViewById(btn_login)

        btn_login.setOnClickListener {
            val pindah: Intent = Intent (this, Dashboard::class.java)
            startActivity(pindah)
        }
    }
}