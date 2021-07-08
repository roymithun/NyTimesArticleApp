package com.inhouse.nytimesarticleapp.data.remote

import com.inhouse.nytimesarticleapp.model.ArticleList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ArticleListApi {
    @GET("all-sections/{period}.json")
    suspend fun fetchArticles(
        @Path("period") period: Int,
        @Query("api-key") apiKey: String = ""
    ): Response<ArticleList>
}

