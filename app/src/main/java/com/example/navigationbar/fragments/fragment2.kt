package com.example.navigationbar.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigationbar.R

class fragment2: Fragment(R.layout.fragment2) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            fragment2Args.fromBundle(requireArguments()).amount.toString()
    }
}