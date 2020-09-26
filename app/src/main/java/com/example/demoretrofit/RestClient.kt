package com.example.demoretrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestClient {

    private var BASE_URL = "https://api.stackexchange.com"
    private var retrofit : Retrofit? = null

    val client : Retrofit
    get() {
        if (retrofit == null){
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return this.retrofit!!
    }
}