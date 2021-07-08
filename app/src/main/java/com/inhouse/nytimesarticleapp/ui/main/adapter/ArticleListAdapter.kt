package com.inhouse.nytimesarticleapp.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.inhouse.nytimesarticleapp.databinding.ListItemBinding
import com.inhouse.nytimesarticleapp.model.Article

class ArticleListAdapter(private val clickListener: OnClickListener) :
    ListAdapter<Article, ArticleListAdapter.ArticleViewHolder>(ArticleItemDiffCallback()) {
    class ArticleViewHolder(private val binding: ListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(article: Article, clickListener: OnClickListener) {
            binding.article = article
            binding.clickListener = clickListener
        }
    }

    interface OnClickListener {
        fun onClick(article: Article)
    }

    class ArticleItemDiffCallback : DiffUtil.ItemCallback<Article>() {
        override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean =
            oldItem.id == newItem.id

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ArticleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        holder.bind(getItem(position), clickListener)
    }
}