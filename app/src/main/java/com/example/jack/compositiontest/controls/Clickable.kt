package com.example.jack.compositiontest.controls

import android.view.View

interface Clickable {
    var listener: (View) -> Unit
}