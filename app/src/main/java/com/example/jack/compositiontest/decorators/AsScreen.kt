package com.example.jack.compositiontest.decorators

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.jack.compositiontest.fragment.FragmentDelegate
import com.example.jack.compositiontest.viewfactories.ViewFactory
import com.example.jack.compositiontest.views.Screen

class AsScreen(private val fragment: Fragment) : FragmentDelegate {

    private var contentBuilder: ViewFactory? = null
    private var viewFactories: List<ViewFactory> = listOf()
    private lateinit var screen: Screen

   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) =
       Screen(inflater.context).also { screen = it }

    override fun onActivityCreated(savedInstanceState: Bundle?): Unit {
        super.onActivityCreated(savedInstanceState)

        if (contentBuilder != null) screen.addContent(build(contentBuilder!!))

        for (control in viewFactories) {
            screen.addControl(build(control))
        }
    }

    private fun build(builder: ViewFactory) =
        builder.makeView(
            screen.context,
            fragment.viewLifecycleOwner
        )

    fun withContent(viewFactory: ViewFactory): AsScreen {
        contentBuilder = viewFactory
        return this
    }

    fun withComponents(vararg viewFactories: ViewFactory): AsScreen {
        this.viewFactories = listOf(*viewFactories)
        return this
    }
}