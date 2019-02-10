package com.example.jack.compositiontest.decorators

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jack.compositiontest.FragmentDelegate
import com.example.jack.compositiontest.Screen
import com.example.jack.compositiontest.controls.ComponentBuilder

class AsScreen(private val fragment: Fragment) : FragmentDelegate {

    private var contentBuilder: ComponentBuilder? = null
    private var componentBuilders: List<ComponentBuilder> = listOf()
    private lateinit var screen: Screen

   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
       Screen(inflater.context).also { screen = it }

    override fun onActivityCreated(savedInstanceState: Bundle?): Unit {
        super.onActivityCreated(savedInstanceState)

        if (contentBuilder != null) screen.addContent(build(contentBuilder!!))

        for (control in componentBuilders) {
            screen.addControl(build(control))
        }
    }

    private fun build(builder: ComponentBuilder) =
        builder.build(
            screen.context,
            fragment.viewLifecycleOwner
        )

    fun withContent(componentBuilder: ComponentBuilder): AsScreen {
        contentBuilder = componentBuilder
        return this
    }

    fun withComponents(vararg componentBuilders: ComponentBuilder): AsScreen {
        this.componentBuilders = listOf(*componentBuilders)
        return this
    }
}