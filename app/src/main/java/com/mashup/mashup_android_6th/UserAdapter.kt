package com.mashup.mashup_android_6th

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.user_list_item.view.*


class UserAdapter(
        private val users: ArrayList<User>,
        private val context: Context
) : RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val view: View = LayoutInflater.from(context).inflate(R.layout.user_list_item, parent, false)

        return UserViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: UserViewHolder, pos: Int) {
        viewHolder.name_tv.text = users.get(pos).name
        viewHolder.email_tv.text = users.get(pos).email
    }

    class UserViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val name_tv = view.name_tv
        val email_tv = view.email_tv
    }
}