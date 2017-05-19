package com.jumy.clouddiy

import org.jetbrains.anko.doAsync
import kotlin.coroutines.experimental.buildSequence

/**
 * Created by lzy on 2017/5/19 14:25.
 * Copyright (c) 2016, yygutn@gmail.com All Rights Reserved.
 */
class KtTest {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            doAsync {

            }
            buildSequence {
                yield(0)
                yieldAll(1..10)
            }
        }
    }
}