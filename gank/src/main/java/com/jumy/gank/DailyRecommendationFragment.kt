package com.jumy.gank

import com.jumy.library.BaseFragment

/**
 * Created by lzy on 2017/5/19 16:40.
 * Copyright (c) 2016, yygutn@gmail.com All Rights Reserved.
 * 每日推荐
 * 更新逻辑：判断上一次请求干货的时间是否是昨天
 * 是：判断是否是大于12：30
 * *****     |是：刷新当天数据
 * *****     |否：使用缓存：|无：请求前一天数据,直到请求到数据为止
 * **********             |有：使用缓存
 * 否：使用缓存 ： |无：请求今天数据
 * **********    |有：使用缓存
 */
class DailyRecommendationFragment : BaseFragment() {
    override fun onViewCreated() {

    }
}