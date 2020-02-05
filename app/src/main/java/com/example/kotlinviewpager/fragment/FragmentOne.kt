package com.example.kotlinviewpager.fragment


import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinviewpager.R
import kotlinx.android.synthetic.main.fragment_fragment_one2.view.*

class FragmentOne(val color:String, val title:String) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val root =  inflater.inflate(R.layout.fragment_fragment_one2, container, false)
        root.setBackgroundColor(Color.parseColor(color))
        root.txtView.setText(title)
        return  root
    }


}
