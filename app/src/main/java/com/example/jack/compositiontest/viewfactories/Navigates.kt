package com.example.jack.compositiontest.viewfactories

import android.util.Log
import androidx.fragment.app.Fragment

class Navigates<T>(navController: Fragment, wrapped: T) :
    HasAction,
    ViewFactory by wrapped,
    HasText by wrapped
    where T : ViewFactory, T : Clickable, T : HasText {

    override var actionId: Int = 0

    init {
        wrapped.listener = { Log.e("Nav", "Action: $actionId") }
    }
}