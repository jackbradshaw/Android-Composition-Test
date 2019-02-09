package com.example.jack.compositiontest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

interface FragmentDelegate {
    fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? = null

    fun onActivityCreated(savedInstanceState: Bundle?) = {}
}