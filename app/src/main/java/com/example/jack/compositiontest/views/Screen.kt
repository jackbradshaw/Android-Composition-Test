package com.example.jack.compositiontest.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class Screen  @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    init {
        orientation = LinearLayout.VERTICAL
    }

    fun addContent(view: View) {
        addView(view)
    }

    fun addControl(view: View) {
        addView(view)
    }
}