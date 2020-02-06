package com.example.kotlinviewpager.adapter

import androidx.annotation.IntegerRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapters (fm: FragmentManager): FragmentPagerAdapter(fm!!){

    private val fragmentList: MutableList<Fragment> = ArrayList()
    private val titleList = ArrayList<String>()
    private val iconTitle = arrayListOf<Int>()

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getCount(): Int {
        return fragmentList.size
    }

    fun addFragment(fragment: Fragment, title:String, icon:Int){
        fragmentList.add(fragment)
        titleList.add(title)
        iconTitle.add(icon)
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }

    override fun getItemPosition(`object`: Any): Int {
        return iconTitle[`object` as Int]
    }
}