package com.example.jack.compositiontest.viewfactories

import android.content.Context
import android.view.View
import android.widget.Button
import androidx.lifecycle.LifecycleOwner

class ButtonFactory(private val layoutRes: Int) : ViewFactory, HasText, Clickable {

    override var textRes = 0
    override var listener: (View) -> Unit = {}

    override fun makeView(context: Context, lifecycleOwner: LifecycleOwner): View {
        return View.inflate(context, layoutRes, null).apply {
            (this as Button).apply{
                setOnClickListener(listener)
                text = context.getText(textRes)
            }
        }
    }
}