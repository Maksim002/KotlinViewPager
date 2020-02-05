package com.example.kotlinviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinviewpager.adapter.PagerAdapters
import com.example.kotlinviewpager.fragment.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  adapters = PagerAdapters(supportFragmentManager)
        adapters.addFragment(FragmentOne("#fefefe","wdwfef"), "One")
        adapters.addFragment(FragmentOne("#fefefe","hgyh"), "tu")
        adapters.addFragment(FragmentOne("#fefefe","egrgrh"), "fry")

        mViewPagers.adapter = adapters
        tab.setupWithViewPager(mViewPagers)
    }
}

