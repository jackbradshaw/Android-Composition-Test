package com.example.jack.compositiontest.viewfactories

import android.util.Log
import androidx.fragment.app.Fragment

class PopsBackStack<T>(navController: Fragment, wrapped: T) :
    ViewFactory by wrapped,
    HasText by wrapped
        where T : ViewFactory, T : Clickable, T : HasText {

    init {
        wrapped.listener = { Log.e("Nav", "Pop back stack") }
    }
}