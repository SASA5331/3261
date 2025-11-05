package com.example.siswa3261

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class Materi_item (val  halaman: Materi, val juduls: MutableList<String>, val namas: MutableList<String>) : BaseAdapter () {
    override fun getCount(): Int {
        return juduls.size
    }

    override fun getItem(position: Int): Any? {
        return juduls.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        val view = LayoutInflater.from(halaman).inflate(R.layout.materi_item, parent, false)
        val tv_judul: TextView = view.findViewById(R.id.tv_judul)
        tv_judul.text = juduls.get(position)

        val tv_nama: TextView = view.findViewById(R.id.tv_nama)
        tv_nama.text = namas.get(position)

        return view
    }
}