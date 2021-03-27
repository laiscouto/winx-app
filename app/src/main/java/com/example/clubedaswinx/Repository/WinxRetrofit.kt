package com.example.clubedaswinx.Repository

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WinxRetrofit private constructor() {

    companion object {
        private lateinit var retrofit: Retrofit
        private val baseUrl = "https://winx-club-api.herokuapp.com/character/"

        fun getRetrofitInstance(): Retrofit {
            val httpClient = OkHttpClient.Builder()
            if (!Companion::retrofit.isInitialized) {
                retrofit = Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .client(httpClient.addInterceptor(HttpLoggingInterceptor().apply
                        {level = HttpLoggingInterceptor.Level.BODY}).build())
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            
            return retrofit
        }

        fun <t> creatService(serviceClass: Class<t>): t {
            return getRetrofitInstance().create(serviceClass)
        }
    }
}