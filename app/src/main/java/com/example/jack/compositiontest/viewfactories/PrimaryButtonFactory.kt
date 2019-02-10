package com.example.jack.compositiontest.viewfactories

import com.example.jack.compositiontest.R

private val buttonFactory = ButtonFactory(R.layout.primary_button)
class PrimaryButtonFactory :
    ViewFactory by buttonFactory,
    HasText by buttonFactory,
    Clickable by buttonFactory