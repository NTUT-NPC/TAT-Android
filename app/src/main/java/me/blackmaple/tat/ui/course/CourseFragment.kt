/*
 * Created by yaoandy107 on 1/30/19 1:59 PM.
 * Last modified 1/30/19 1:59 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package me.blackmaple.tat.ui.course

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.blackmaple.tat.R

class CourseFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_course, container, false)
    }
}
