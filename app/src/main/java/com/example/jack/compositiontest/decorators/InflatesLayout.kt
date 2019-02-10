package com.example.jack.compositiontest.decorators

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jack.compositiontest.FragmentDelegate

class InflatesLayout(private val resId: Int): FragmentDelegate {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(resId, container, false)
    }
}