package com.jumy.gank

import android.graphics.Color
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.widget.LinearLayout
import com.jumy.library.BaseFragment
import com.jumy.library.FragmentTabAdapter
import org.jetbrains.anko.backgroundResource
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.tabLayout
import org.jetbrains.anko.dip
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.support.v4.UI
import org.jetbrains.anko.support.v4.viewPager
import org.jetbrains.anko.verticalLayout

/**
 * Created by lzy on 2017/5/19 15:29.
 * Copyright (c) 2016, yygutn@gmail.com All Rights Reserved.
 */
class GankMainFragment : BaseFragment() {

    lateinit var mTab: TabLayout
    lateinit var mViewPager: ViewPager
    override fun createView() {
        UI {
            verticalLayout {
                orientation = LinearLayout.VERTICAL
                appBarLayout {
                    mTab = tabLayout {
                        backgroundResource = R.drawable.bg_main_tab
                        setSelectedTabIndicatorColor(R.color.colorTabLine)
                        setTabTextColors(R.color.colorTabTextNormal, R.color.colorTabTextCheck)
                    }.lparams(matchParent, dip(40))

                }
                mViewPager = viewPager().lparams(matchParent, matchParent)
            }
        }
    }


    override fun onViewCreated() {
        createView()
        mTab.addTab(mTab.newTab().setText("每日推荐"))
        mTab.addTab(mTab.newTab().setText("福利"))
        mTab.addTab(mTab.newTab().setText("干货"))
        mTab.addTab(mTab.newTab().setText("Android"))

        mViewPager.adapter = FragmentTabAdapter(childFragmentManager, mutableListOf())
        mTab.setupWithViewPager(mViewPager)
    }
}