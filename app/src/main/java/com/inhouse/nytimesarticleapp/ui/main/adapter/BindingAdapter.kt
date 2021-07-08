package com.inhouse.nytimesarticleapp.ui.main.adapter

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.inhouse.nytimesarticleapp.model.Article

@BindingAdapter("articleList")
fun bindDataToRecyclerView(recyclerView: RecyclerView, list: List<Article>?) {
    list?.let {
        (recyclerView.adapter as ArticleListAdapter).apply {
            submitList(currentList + it)
        }
    }
}