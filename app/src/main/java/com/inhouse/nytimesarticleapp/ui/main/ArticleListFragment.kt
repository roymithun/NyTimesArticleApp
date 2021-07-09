package com.inhouse.nytimesarticleapp.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.inhouse.nytimesarticleapp.databinding.FragmentArticleListBinding
import com.inhouse.nytimesarticleapp.model.Article
import com.inhouse.nytimesarticleapp.ui.main.adapter.ArticleListAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ArticleListFragment : Fragment() {
    lateinit var binding: FragmentArticleListBinding
    lateinit var articleListAdapter: ArticleListAdapter
    private val articleListViewModel: ArticleListViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentArticleListBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = this
        binding.articleViewModel = articleListViewModel
        // configure recycler view
        configureRecyclerView(binding.rvArticleList)

        // register observers
        articleListViewModel.navigateToArticleDetail.observe(viewLifecycleOwner) {
            it?.let {
                findNavController().navigate(
                    ArticleListFragmentDirections.actionArticleListFragmentToDetailFragment(it)
                )
                articleListViewModel.doneNavigationToDetail()
            }
        }
    }

    private fun configureRecyclerView(recyclerView: RecyclerView) {
        articleListAdapter = ArticleListAdapter(object : ArticleListAdapter.OnClickListener {
            override fun onClick(article: Article) {
                articleListViewModel.showArticleDetail(article)
            }
        })
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = articleListAdapter
    }
}