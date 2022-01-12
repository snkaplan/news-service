package com.rocket.newsservice.service

import com.rocket.newsservice.model.NYTArticleResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface NYTInterface {
    @GET("articlesearch.json")
    fun listArticles(@QueryMap query: Map<String, String>, @Query("api-key") apiKey: String): Call<NYTArticleResponse>?
}