package com.example.siswa3261

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboard)

        val tv_nama_siswa: TextView = findViewById(R.id.tv_nama_siswa)
        val iv_foto_siswa: ImageView =  findViewById(R.id.iv_foto_siswa)

        tv_nama_siswa.text = getSharedPreferences("siswa", MODE_PRIVATE).getString("nama_siswa", null)

        val cv_akun: CardView =  findViewById(R.id.cv_akun)
        val cv_pengumuman: CardView =  findViewById(R.id.cv_pengumuman)
        val cv_materi: CardView =  findViewById(R.id.cv_materi)
        val cv_nilai: CardView =  findViewById(R.id.cv_nilai)
        val cv_presensi: CardView =  findViewById(R.id.cv_presensi)
        val cv_logout: CardView =  findViewById(R.id.cv_logout)


        cv_akun.setOnClickListener {
            val pindah:Intent = Intent(this, Akun::class.java)
            startActivity(pindah)
        }
        cv_pengumuman.setOnClickListener {
            val geser: Intent = Intent(this, Pengumumman::class.java)
            startActivity(geser)
        }
        cv_materi.setOnClickListener {
            val pindah:Intent = Intent(this, Materi::class.java)
            startActivity(pindah)
        }
        cv_nilai.setOnClickListener {
            val geser: Intent = Intent(this, Nilai::class.java)
            startActivity(geser)
        }
        cv_presensi.setOnClickListener {
            val geser: Intent = Intent(this, Presensi::class.java)
            startActivity(geser)
        }
        cv_logout.setOnClickListener {
            val geser: Intent = Intent(this, Login::class.java)
            startActivity(geser)
        }
    }
}