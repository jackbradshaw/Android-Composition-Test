package com.example.jack.compositiontest.viewfactories

import com.example.jack.compositiontest.R

private val buttonFactory = ButtonFactory(R.layout.secondary_button)
class SecondaryButtonFactory :
    ViewFactory by buttonFactory,
    HasText by buttonFactory,
    Clickable by buttonFactory