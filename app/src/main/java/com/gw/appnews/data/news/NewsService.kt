package com.gw.appnews.data.news

import com.gw.appnews.BuildConfig
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("top-headlines?country=br")
    fun getNews(
        @Query("category") category: String = "technology",
        @Query("apiKey") apiKey: String = BuildConfig.NEWS_API_KEY
    ): Call<NewsResponse>
}