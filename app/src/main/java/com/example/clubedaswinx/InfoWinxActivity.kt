package com.example.clubedaswinx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.clubedaswinx.MainActivity.Companion.KEY_NAME
import kotlinx.android.synthetic.main.activity_info_winx.*

class InfoWinxActivity : AppCompatActivity() {
    private val name by lazy { intent.extras?.getString(KEY_NAME) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_winx)
        test.text = name
    }
}