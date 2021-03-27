package com.example.clubedaswinx.UI

import androidx.recyclerview.widget.DiffUtil

class WinxDiffUltis: DiffUtil.ItemCallback<WinxPresentation> (){

    override fun areItemsTheSame(oldItem: WinxPresentation, newItem: WinxPresentation): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: WinxPresentation, newItem: WinxPresentation): Boolean {
        return oldItem == newItem
    }
}