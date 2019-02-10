package com.example.jack.compositiontest

import com.example.jack.compositiontest.decorators.AsScreen
import com.example.jack.compositiontest.fragment.DelegatingFragment
import com.example.jack.compositiontest.viewfactories.*

class FragmentTwo : DelegatingFragment() {
    override val delegate = AsScreen(this)
        .withContent(
            ContentFactory().apply {
                textRes = R.string.hello_world
            }
        )
        .withComponents(
            Navigates(this, PrimaryButtonFactory()).apply {
                textRes = R.string.click_me
                actionId = 1
            },
            PopsBackStack(this, SecondaryButtonFactory()).apply {
                textRes = R.string.no_click_me
            }
        )
}