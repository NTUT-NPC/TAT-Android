/*
 * Created by yaoandy107 on 1/30/19 1:59 PM.
 * Last modified 1/30/19 1:59 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package me.blackmaple.tat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import androidx.navigation.ui.AppBarConfiguration

class MainActivity : AppCompatActivity() {

    private val navController by lazy { findNavController(R.id.nav_host_fragment) }
    private val appBarConfiguration by lazy {
        AppBarConfiguration(setOf(R.id.navigation_course, R.id.navigation_calendar, R.id.navigation_menu)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupToolbar()
        setupBottomNavigation()
    }

    // Setup toolbar with navigation controller
    private fun setupToolbar () {
        toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    // Setup bottom navigation with navigation controller
    private fun setupBottomNavigation () {
        bottom_navigation.setupWithNavController(navController)
    }
}
