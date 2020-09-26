package com.example.demoretrofit.rest

import com.example.demoretrofit.Model.QuestionList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("/2.2/search?order=desc&sort=activity&tagged=android&site=stackoverflow")

    fun fetchQuestion(@Query("tagged") tags : String) : Call<QuestionList>
}