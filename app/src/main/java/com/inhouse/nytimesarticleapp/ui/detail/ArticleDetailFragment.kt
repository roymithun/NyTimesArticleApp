package com.inhouse.nytimesarticleapp.ui.detail

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import androidx.fragment.app.Fragment
import com.inhouse.nytimesarticleapp.R

class ArticleDetailFragment : Fragment(R.layout.fragment_article_detail) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val selectedArticle =
            ArticleDetailFragmentArgs.fromBundle(requireArguments()).selectedArticle
        val webView: WebView = view.findViewById(R.id.web_view_article)
        webView.loadUrl(selectedArticle.url)
    }
}