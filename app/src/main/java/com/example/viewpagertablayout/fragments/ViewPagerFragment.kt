package com.example.viewpagertablayout.fragments

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.viewpagertablayout.R
import com.example.viewpagertablayout.models.Page

class ViewPagerFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_view_pager, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentWV = view.findViewById<WebView>(R.id.fragmentWV)
        val viewPagerItem = arguments?.getSerializable("page") as Page
        fragmentWV.webViewClient = WebViewClient()
        fragmentWV.loadUrl(viewPagerItem.address)
    }
}