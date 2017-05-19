package com.jumy.library

import android.app.Activity
import android.app.Application
import android.os.Bundle

/**
 * Created by lzy on 2017/5/19 15:20.
 * Copyright (c) 2016, yygutn@gmail.com All Rights Reserved.
 */
open class BaseActivityLCB : Application.ActivityLifecycleCallbacks {
    override fun onActivityPaused(activity: Activity?) {
    }

    override fun onActivityResumed(activity: Activity?) {
    }

    override fun onActivityStarted(activity: Activity?) {
    }

    override fun onActivityDestroyed(activity: Activity?) {
    }

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
    }

    override fun onActivityStopped(activity: Activity?) {
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
    }
}