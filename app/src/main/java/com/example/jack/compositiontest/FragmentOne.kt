package com.example.jack.compositiontest

import com.example.jack.compositiontest.decorators.InflatesLayout
import com.example.jack.compositiontest.fragment.DelegatingFragment

class FragmentOne : DelegatingFragment() {
    override val delegate = InflatesLayout(R.layout.fragment_one)
}