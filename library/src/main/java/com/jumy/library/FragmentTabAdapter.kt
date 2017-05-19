package com.jumy.library

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import me.yokeyword.fragmentation.SupportFragment

/**
 * Created by lzy on 2017/5/19 16:20.
 * Copyright (c) 2016, yygutn@gmail.com All Rights Reserved.
 */
class FragmentTabAdapter(fm: FragmentManager, private val mFragment: MutableList<SupportFragment>) : FragmentPagerAdapter(fm) {
    init {
        if (mFragment.isEmpty()){
            throw Exception("fragments can not be empty : mFragment size is ${mFragment.size}")
        }
    }
    override fun getItem(position: Int): Fragment {
        return mFragment[position]
    }

    override fun getCount(): Int {
        return mFragment.size
    }
}