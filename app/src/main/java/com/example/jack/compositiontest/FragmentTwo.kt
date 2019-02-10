package com.example.jack.compositiontest

import com.example.jack.compositiontest.controls.ContentBuilder
import com.example.jack.compositiontest.controls.Navigating
import com.example.jack.compositiontest.controls.PrimaryButtonBuilder
import com.example.jack.compositiontest.decorators.AsScreen

class FragmentTwo : DelegatingFragment() {
    override val delegate = AsScreen(this)
        .withContent(
            ContentBuilder().apply {
                textRes = R.string.hello_world
            }
        )
        .withComponents(
            Navigating(this, PrimaryButtonBuilder()).apply {
                textRes = R.string.click_me
                actionId = 1
            }
        )
}