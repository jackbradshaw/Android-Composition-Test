package com.example.jack.compositiontest.controls

import com.example.jack.compositiontest.R

private val buttonBuilder = ButtonBuilder(R.layout.primary_button)
class PrimaryButtonBuilder :
    ComponentBuilder by buttonBuilder,
    HasText by buttonBuilder,
    Clickable by buttonBuilder