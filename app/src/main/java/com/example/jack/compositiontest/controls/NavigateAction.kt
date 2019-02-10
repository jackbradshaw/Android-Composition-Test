package com.example.jack.compositiontest.controls

import android.util.Log
import androidx.fragment.app.Fragment

class NavigateAction<T>(navController: Fragment, wrapped: T) :
    HasAction,
    ComponentBuilder by wrapped,
    HasText by wrapped
    where T : ComponentBuilder, T : Clickable, T : HasText {

    override var actionId: Int = 0

    init {
        wrapped.listener = { Log.e("Nav", "Action: $actionId") }
    }
}