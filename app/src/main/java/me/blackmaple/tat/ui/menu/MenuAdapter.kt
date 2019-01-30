/*
 * Created by yaoandy107 on 1/30/19 1:59 PM.
 * Last modified 1/30/19 1:59 PM.
 * Copyright (c) 2019. All rights reserved.
 */

package me.blackmaple.tat.ui.menu

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_other.view.*
import me.blackmaple.tat.R
import me.blackmaple.tat.model.MenuItem

class MenuAdapter(
    private var menuItemList: List<MenuItem>
): RecyclerView.Adapter<MenuAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_other, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return menuItemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(menuItemList[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(menuItem: MenuItem) {
            itemView.iv_menu_item.setImageDrawable(menuItem.iconResDrawable)
            itemView.tv_menu_item_title.text = menuItem.title
        }
    }
}