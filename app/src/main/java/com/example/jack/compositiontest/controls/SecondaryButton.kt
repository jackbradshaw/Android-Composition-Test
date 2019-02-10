package com.example.jack.compositiontest.controls

import com.example.jack.compositiontest.R

private val buttonBuilder = ButtonBuilder(R.layout.secondary_button)
class SecondaryButtonBuilder :
    ComponentBuilder by buttonBuilder,
    HasText by buttonBuilder,
    Clickable by buttonBuilder