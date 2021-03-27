package com.example.clubedaswinx.Repository

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface WinxService {
    @GET("{name}")
    fun list(@Path("name") name: String): Call<ServiceWinxModel>
}