/*
 * Created by yaoandy107 on 1/30/19 1:59 PM.
 * Last modified 1/30/19 1:59 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package me.blackmaple.tat

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import me.blackmaple.tat.ui.course.CourseViewModel

class ViewModelFactory private constructor(
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) =
        with(modelClass) {
            when {
                isAssignableFrom(CourseViewModel::class.java) ->
                    CourseViewModel()
                else ->
                    throw IllegalArgumentException("Unknown ViewHolder class: ${modelClass.name}")
            }
        } as T

    companion object {

        @Volatile private var INSTANCE: ViewModelFactory? = null

        fun getInstance() =
            INSTANCE ?: synchronized(ViewModelFactory::class.java) {
                INSTANCE ?: ViewModelFactory()
            }
    }
}