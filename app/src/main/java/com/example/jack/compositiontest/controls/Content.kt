package com.example.jack.compositiontest.controls

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import com.example.jack.compositiontest.R

class ContentBuilder : ComponentBuilder, HasText {

    override var textRes = 0

    override fun build(context: Context, lifecyclerOwner: LifecycleOwner): View {
        return View.inflate(context, R.layout.content, null).apply {
            findViewById<TextView>(R.id.textView).apply{
                text = context.getText(textRes)
            }
        }
    }
}