package com.example.jack.compositiontest.controls

import android.util.Log
import androidx.fragment.app.Fragment

class PopsBackStack<T>(navController: Fragment, wrapped: T) :
    ComponentBuilder by wrapped,
    HasText by wrapped
        where T : ComponentBuilder, T : Clickable, T : HasText {

    init {
        wrapped.listener = { Log.e("Nav", "Pop back stack") }
    }
}