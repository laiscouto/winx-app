package com.example.clubedaswinx.UI

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_winx_imagens.view.*

class WinxViewHolder(itemView: View, private val onCLickItem:(nome: String)-> Unit): RecyclerView.ViewHolder(itemView) {

    fun bind(winxPresentation: WinxPresentation){
        itemView.setOnClickListener(){
            onCLickItem(winxPresentation.name)
        }
        itemView.Fada.setImageResource(winxPresentation.image)
        itemView.NameFada.text = winxPresentation.name
    }
}