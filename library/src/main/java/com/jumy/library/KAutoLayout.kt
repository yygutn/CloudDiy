package com.jumy.library

import android.view.ViewManager
import com.zhy.autolayout.AutoFrameLayout
import com.zhy.autolayout.AutoLinearLayout
import com.zhy.autolayout.AutoRelativeLayout
import org.jetbrains.anko.custom.ankoView

/**
 * Created by lzy on 2017/5/19 15:04.
 * Copyright (c) 2016, yygutn@gmail.com All Rights Reserved.
 */
inline fun ViewManager.autoFrameLayout() = autoFrameLayout() {}

inline fun ViewManager.autoFrameLayout(init: AutoFrameLayout.() -> Unit): AutoFrameLayout {
    return ankoView({ AutoFrameLayout(it) }, theme = 0, init = init)
}

inline fun ViewManager.autoLinearLayout() = autoFrameLayout() {}

inline fun ViewManager.autoLinearLayout(init: AutoLinearLayout.() -> Unit): AutoLinearLayout {
    return ankoView({ AutoLinearLayout(it) }, theme = 0, init = init)
}

inline fun ViewManager.autoRelativeLayout() = autoFrameLayout() {}

inline fun ViewManager.autoRelativeLayout(init: AutoRelativeLayout.() -> Unit): AutoRelativeLayout {
    return ankoView({ AutoRelativeLayout(it) }, theme = 0, init = init)
}
