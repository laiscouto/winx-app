package com.example.clubedaswinx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.clubedaswinx.MainActivity.Companion.KEY_NAME
import com.example.clubedaswinx.Repository.ServiceWinxModel
import com.example.clubedaswinx.Repository.WinxService
import com.example.clubedaswinx.Repository.WinxRetrofit
import kotlinx.android.synthetic.main.activity_info_winx.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class InfoWinxActivity : AppCompatActivity() {
    private val name by lazy { intent.extras?.getString(KEY_NAME) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info_winx)
        namefada.text = name

        val remote = WinxRetrofit.creatService(WinxService::class.java)

        val call: Call<ServiceWinxModel> = remote.list(name.orEmpty().toLowerCase(Locale.ROOT))

        val response = call.enqueue(object : Callback<ServiceWinxModel> {

            override fun onResponse(call: Call<ServiceWinxModel>, response: Response<ServiceWinxModel>) {
                Log.d("WinxApp", "Resposta = ${response.body()}")
                runOnUiThread {caractFadas.text = response.body().toString()}
            }
            override fun onFailure(call: Call<ServiceWinxModel>, t: Throwable) {
                Log.d("WinxApp", "Resposta = $t")
            }

        })

    }
}





