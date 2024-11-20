package com.example.viewpagertablayout

import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagertablayout.fragments.ViewPagerFragment
import com.example.viewpagertablayout.models.Page

class PageAdapter(
    fragment: FragmentActivity,
    private val pageList: MutableList<Page>
) : FragmentStateAdapter(fragment) {
    override fun createFragment(position: Int): Fragment {
        val fragment = ViewPagerFragment()
        fragment.arguments = bundleOf("page" to pageList[position])
        return fragment
    }

    override fun getItemCount(): Int {
        return pageList.size
    }

}