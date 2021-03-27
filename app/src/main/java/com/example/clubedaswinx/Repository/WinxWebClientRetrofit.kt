package com.example.clubedaswinx.Repository

/*import android.util.Log
import com.example.clubedaswinx.InfoWinxActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class WinxWebClientRetrofit():  {

    val remote = WinxRetrofit.creatService(WinxService::class.java)
    val call: Call<ServiceWinxModel> = remote.list(name.orEmpty().toLowerCase())

    val response = call.enqueue(object : Callback<ServiceWinxModel> {
        override fun onResponse(
                call: Call<ServiceWinxModel>,
                response: Response<ServiceWinxModel>
        ) {
            Log.d("WinxApp", "Resposta = ${response.body()}")
        }

        override fun onFailure(call: Call<ServiceWinxModel>, t: Throwable) {
            Log.d("WinxApp", "Resposta = $t")
        }
    })
}*/