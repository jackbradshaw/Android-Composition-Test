package com.example.jack.compositiontest.controls

import android.content.Context
import android.view.View
import androidx.lifecycle.LifecycleOwner

interface ComponentBuilder {
    fun build(context: Context, lifecyclerOwner: LifecycleOwner): View
}