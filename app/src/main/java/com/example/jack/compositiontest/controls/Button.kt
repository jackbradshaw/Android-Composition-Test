package com.example.jack.compositiontest.controls

import android.content.Context
import android.view.View
import android.widget.Button
import androidx.lifecycle.LifecycleOwner

class ButtonBuilder(private val layoutRes: Int) : ComponentBuilder, HasText, Clickable {

    override var textRes = 0
    override var listener: (View) -> Unit = {}

    override fun build(context: Context, lifecyclerOwner: LifecycleOwner): View {
        return View.inflate(context, layoutRes, null).apply {
            (this as Button).apply{
                setOnClickListener(listener)
                text = context.getText(textRes)
            }
        }
    }
}