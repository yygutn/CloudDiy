package com.jumy.library

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.Toolbar
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.yokeyword.fragmentation.SupportFragment

/**
 * Created by lzy on 2017/5/19 15:40.
 * Copyright (c) 2016, yygutn@gmail.com All Rights Reserved.
 */
abstract class BaseFragment : SupportFragment() {
    protected open fun getLayoutId(): Int{
        return -1
    }

    protected open fun createView() {
    }

    protected abstract fun onViewCreated()

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if (getLayoutId() > 0){
            return inflater?.inflate(getLayoutId(),container,true)
        }
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onViewCreated()
    }

    protected fun initToolBarNav(toolbar: Toolbar) {
        toolbar.navigationIcon = ContextCompat.getDrawable(context, R.drawable.ic_arrow_back_white_24dp)
        toolbar.setNavigationOnClickListener {
            onBackPressedSupport()
        }
        initToolbarMenu(toolbar)
    }

    protected open fun initToolbarMenu(toolbar: Toolbar) {
    }
}