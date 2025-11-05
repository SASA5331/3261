package com.example.siswa3261

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class Materi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.materi)

        val gv_materi: GridView =findViewById(R.id.gv_materi)

        var juduls: MutableList<String> = mutableListOf()
        juduls.add("Pengenalan Bahasa Kotlin Amikom")
        juduls.add("Pindah Halaman dengan Intent")
        juduls.add("Menampilkan Data Statis")
        juduls.add("Menampilkan Data Dinamis")

        var namas: MutableList<String> = mutableListOf()
        namas.add("Arif Nur Rohman")
        namas.add("Bambas Pamungkang")
        namas.add("Cintya")
        namas.add("Dodi Simanjuntak")

        val perulangandata = Materi_item(this, juduls, namas)

        gv_materi.adapter = perulangandata
    }
}