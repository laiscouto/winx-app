package com.example.clubedaswinx.UI

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.clubedaswinx.R

class WinxAdapter(private val onCLickItem: (nome: String) -> Unit) : ListAdapter<WinxPresentation, WinxViewHolder>(WinxDiffUltis()) {

    private val list = mutableListOf<WinxPresentation>()

    fun add(winxPresentation: WinxPresentation) {
        list.add(winxPresentation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WinxViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_winx_imagens, parent, false)
        return WinxViewHolder(view, onCLickItem)
    }

    override fun onBindViewHolder(holder: WinxViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}