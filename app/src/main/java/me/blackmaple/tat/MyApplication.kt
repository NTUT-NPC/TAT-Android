/*
 * Created by yaoandy107 on 1/30/19 1:59 PM.
 * Last modified 1/30/19 1:59 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package me.blackmaple.tat

import android.app.Application
import com.squareup.leakcanary.LeakCanary

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return
        }
        LeakCanary.install(this)
    }

}