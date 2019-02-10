package com.example.jack.compositiontest.viewfactories

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import com.example.jack.compositiontest.R

class ContentFactory : ViewFactory, HasText {

    override var textRes = 0

    override fun makeView(context: Context, lifecycleOwner: LifecycleOwner): View {
        return View.inflate(context, R.layout.content, null).apply {
            findViewById<TextView>(R.id.textView).apply{
                text = context.getText(textRes)
            }
        }
    }
}