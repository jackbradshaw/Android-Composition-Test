package com.example.jack.compositiontest

import com.example.jack.compositiontest.controls.*
import com.example.jack.compositiontest.decorators.AsScreen

class FragmentTwo : DelegatingFragment() {
    override val delegate = AsScreen(this)
        .withContent(
            ContentBuilder().apply {
                textRes = R.string.hello_world
            }
        )
        .withComponents(
            NavigateAction(this, PrimaryButtonBuilder()).apply {
                textRes = R.string.click_me
                actionId = 1
            },
            PopsBackStack(this, SecondaryButtonBuilder()).apply {
                textRes = R.string.no_click_me
            }
        )
}