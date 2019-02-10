package com.example.jack.compositiontest

import com.example.jack.compositiontest.decorators.InflatesLayout

class FragmentOne : DelegatingFragment() {
    override val delegate = InflatesLayout(R.layout.fragment_one)
}