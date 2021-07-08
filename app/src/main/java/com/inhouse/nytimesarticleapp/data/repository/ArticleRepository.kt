package com.inhouse.nytimesarticleapp.data.repository

import androidx.lifecycle.LiveData
import com.inhouse.nytimesarticleapp.model.Article
import com.inhouse.nytimesarticleapp.utils.Resource

interface ArticleRepository {
    suspend fun fetchArticles(period: Int): Resource<List<Article>>

    fun observableArticleList() : LiveData<List<Article>>
}