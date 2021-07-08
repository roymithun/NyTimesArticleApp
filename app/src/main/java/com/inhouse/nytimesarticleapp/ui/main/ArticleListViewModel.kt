package com.inhouse.nytimesarticleapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.inhouse.nytimesarticleapp.data.repository.ArticleRepository
import com.inhouse.nytimesarticleapp.model.Article
import com.inhouse.nytimesarticleapp.utils.Resource
import com.inhouse.nytimesarticleapp.utils.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ArticleListViewModel @Inject constructor(private val articleRepository: ArticleRepository) :
    ViewModel() {
    private val _networkErrorState = MutableLiveData<Boolean?>()
    val networkErrorState: LiveData<Boolean?> = _networkErrorState

    val articleList = articleRepository.observableArticleList()

    init {
        getArticleList()
    }

    private fun getArticleList() {
        viewModelScope.launch {
            val fetchArticles: Resource<List<Article>> = articleRepository.fetchArticles(7)
            _networkErrorState.postValue(
                when (fetchArticles.status) {
                    Status.ERROR -> {
                        articleList.value.isNullOrEmpty()
                    }
                    else -> false
                }
            )
        }
    }

    fun resetNetworkErrorStatus() {
        _networkErrorState.value = null
    }
}