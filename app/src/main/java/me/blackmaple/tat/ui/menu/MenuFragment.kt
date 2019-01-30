/*
 * Created by yaoandy107 on 1/30/19 1:59 PM.
 * Last modified 1/30/19 1:59 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package me.blackmaple.tat.ui.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_menu.*
import me.blackmaple.tat.R
import me.blackmaple.tat.model.MenuItem
import java.util.ArrayList

class MenuFragment : Fragment() {

    private val menuItemList by lazy { ArrayList<MenuItem>() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_menu, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListData()
        setupRecyclerView()
    }

    private fun initListData() {
        menuItemList.add(MenuItem(
            iconResDrawable = ContextCompat.getDrawable(context!!, R.drawable.ic_settings)!!,
            title = "設定"))
    }

    private fun setupRecyclerView() {
        rv_other.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = MenuAdapter(menuItemList)
        }
    }
}
