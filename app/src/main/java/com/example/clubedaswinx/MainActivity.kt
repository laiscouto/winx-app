package com.example.clubedaswinx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.clubedaswinx.UI.WinxAdapter
import com.example.clubedaswinx.UI.WinxPresentation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val adapter = WinxAdapter(::handleClick)
    private val list = listOf(WinxPresentation(R.drawable.bloom, "Bloom"),
            WinxPresentation(R.drawable.flora, "Flora"), WinxPresentation(R.drawable.musa,
            "Musa"), WinxPresentation(R.drawable.stela, "Stela"),
            WinxPresentation(R.drawable.original, "Techna")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        winxList()
        Imagens.layoutManager = GridLayoutManager(this, 2)
        Imagens.adapter = this.adapter
    }

    fun winxList() {
        /*list.forEach{adapter.add(it)}*/
        adapter.submitList(list)
    }

    fun handleClick(nome: String) {
        val intent = Intent(this, InfoWinxActivity::class.java).apply {
            val bundle = Bundle()
            bundle.putString(KEY_NAME, nome)
            putExtras(bundle)
        }
        startActivity(intent)
    }

    companion object {
        const val KEY_NAME = "Name"
    }
}