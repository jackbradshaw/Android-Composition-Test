package com.example.jack.compositiontest.controls

import android.util.Log
import androidx.fragment.app.Fragment

class Navigating<T>(navController: Fragment, wrapped: T) :
    HasAction,
    ComponentBuilder by wrapped,
    HasText by wrapped
    where T : ComponentBuilder, T : Clickable, T : HasText {

    override var actionId: Int = 0

    init {
        wrapped.listener = { Log.d("Nav", "Action: $actionId") }
    }
}