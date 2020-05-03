package com.example.customview.view

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import com.example.customview.R
import kotlinx.android.synthetic.main.item_layout.view.*

class CustomView2 @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : LinearLayout(context, attrs, defStyle) {

    init {
        LayoutInflater.from(context).inflate(R.layout.item_layout, this, true)
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.custom_component_attributes, 0, 0)

            val myString: CharSequence = typedArray.getText(R.styleable.custom_component_attributes_custom_component_title)
            tv_text.text  = myString

            val textColor: Int = typedArray.getInt(R.styleable.custom_component_attributes_custom_component_foreground_color, R.color.cardview_shadow_start_color)
            tv_text.setTextColor(textColor)
            iv_icon.setColorFilter(textColor)

            val chevronVisibility: Boolean = typedArray.getBoolean(R.styleable.custom_component_attributes_custom_component_chevron_vis, false)
            if (chevronVisibility) {
                iv_chevron.visibility = View.VISIBLE
            } else {
                iv_chevron.visibility = View.GONE
            }

            val img: Drawable? = typedArray.getDrawable(R.styleable.custom_component_attributes_custom_component_image)
            iv_icon.setImageDrawable(img)
        }
    }

}