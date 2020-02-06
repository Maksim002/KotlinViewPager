package com.example.kotlinviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import com.example.kotlinviewpager.adapter.PagerAdapters
import com.example.kotlinviewpager.fragment.*
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var tabL: TabLayout
    private var list = mutableListOf<MyList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        list.add(MyList(FragmentOne("#fefefe", "wdwfef"), "kug", R.drawable.ic_airplanemode_active_black_24dp))
        list.add(MyList(FragmentOne("#fefefe", "wdwfef"), "kug", R.drawable.ic_home_black_24dp))
        list.add(MyList(FragmentOne("#fefefe", "wdwfef"), "kug", R.drawable.ic_airplanemode_active_black_24dp))
        list.add(MyList(FragmentOne("#fefefe", "wdwfef"), "kug", R.drawable.ic_attach_file_black_24dp))


        var adapters = PagerAdapters(supportFragmentManager)


        list.forEachIndexed { index, element ->
            adapters.addFragment(element.fragment, element.title, element.icon)
        }
        mViewPagers.adapter = adapters
        tab.setupWithViewPager(mViewPagers)

        list.forEachIndexed { index, element ->
                tab.getTabAt(index)?.setIcon(element.icon)


        }

    }
}

