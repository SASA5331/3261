package com.example.siswa3261


import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Pengumumman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pengumumman)

        var juduls: MutableList<String> = mutableListOf()
        juduls.add("Pengumumman amikom 1")
        juduls.add("Pengumumman amikom 2")
        juduls.add("Pengumumman amikom 3")
        juduls.add("Pengumumman amikom 4")
        juduls.add("Pengumumman amikom 5")
        juduls.add("Pengumumman amikom 6")
        juduls.add("Pengumumman amikom 7")
        juduls.add("pengumumman amikom 8")
        juduls.add("Pengumumman amikom 9")
        juduls.add("Pengumumman amikom 10")

        var tanggals: MutableList<String> = mutableListOf()
        tanggals.add("1 Januari 2024")
        tanggals.add("1 Februari 2024")
        tanggals.add("1 Maret 2024")
        tanggals.add("1 April 2024")
        tanggals.add("1 Mei 2024")
        tanggals.add("1 Juni 2024")
        tanggals.add("1 Juli 2024")
        tanggals.add("1 Agustus 2024")
        tanggals.add("1 September 2024")
        tanggals.add("1 Oktober 2024")

        var lv_pengumumman: ListView = findViewById(R.id.lv_pengumumman)

        var perulangandata = Pengumumman_item(this, juduls, tanggals)

        lv_pengumumman.adapter = perulangandata
    }
}