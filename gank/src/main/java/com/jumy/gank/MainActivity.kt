package com.jumy.gank

import android.os.Bundle
import me.yokeyword.fragmentation.SupportActivity

class MainActivity : SupportActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadRootFragment(android.R.id.content, GankMainFragment())
    }

}
