package com.example.siswa3261

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Pengumumman_item (val halaman: Pengumumman, val juduls: MutableList<String>, val tanggals: MutableList<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return juduls.size
    }

    override fun getItem(position: Int): Any? {
        return juduls.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(halaman).inflate(com.example.siswa3261.R.layout.pengumumman_item, parent, false)
        val tv_judul: TextView = view.findViewById(com.example.siswa3261.R.id.tv_judul)
        val tv_tanggal: TextView = view.findViewById(com.example.siswa3261.R.id.tv_tanggal)
        tv_judul.text = juduls.get(position)
        tv_tanggal.text = tanggals.get(position)

        return view
    }
}