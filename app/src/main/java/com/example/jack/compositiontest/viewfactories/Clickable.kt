package com.example.jack.compositiontest.viewfactories

import android.view.View

interface Clickable {
    var listener: (View) -> Unit
}