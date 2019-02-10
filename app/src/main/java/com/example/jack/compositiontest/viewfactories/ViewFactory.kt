package com.example.jack.compositiontest.viewfactories

import android.content.Context
import android.view.View
import androidx.lifecycle.LifecycleOwner

interface ViewFactory {
    fun makeView(context: Context, lifecycleOwner: LifecycleOwner): View
}