package com.udacity.shoestore

import android.R
import android.content.Context
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout


class customView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    init {
        inflate(context, R.layout.shoe_item, this)
    }
}