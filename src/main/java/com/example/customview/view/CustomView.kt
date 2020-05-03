package com.example.customview.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.cardview.widget.CardView
import com.example.customview.R
import com.example.customview.model.Users
import kotlinx.android.synthetic.main.item_layout.view.*

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : CardView(context, attrs, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.item_layout, this, true)
    }

    fun setUser(user: Users) {
        tv_text.text = user.text
        tv_text.setTextColor(user.foregroundColor)
        iv_chevron.visibility = if (user.showChevron) View.VISIBLE else View.INVISIBLE
        iv_icon.setImageResource(user.image)
        iv_icon.setColorFilter(user.foregroundColor)
    }

}