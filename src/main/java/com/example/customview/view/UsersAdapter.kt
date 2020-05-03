package com.example.customview.view

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.customview.model.Users

class UsersAdapter(val users: List<Users>): RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        // no need for a LayoutInflater instance—
        // the custom view inflates itself
        val itemView = CustomView(parent.context)
        // manually set the CustomView's size
        itemView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        return UsersViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.customView.setUser(users[position])
    }

    class UsersViewHolder(v: View): RecyclerView.ViewHolder(v) {
        var customView: CustomView = v as CustomView
    }
}