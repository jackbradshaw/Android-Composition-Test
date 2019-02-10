package com.example.jack.compositiontest.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class DelegatingFragment : Fragment() {

    abstract val delegate: FragmentDelegate

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val superResult = super.onCreateView(inflater, container, savedInstanceState)
        return delegate.onCreateView(inflater, container, savedInstanceState) ?: superResult
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        delegate.onActivityCreated(savedInstanceState)
    }
}