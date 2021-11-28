package com.example.navigationbar.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.navigationbar.R

class fragment1: Fragment(R.layout.fragment1) {
    private lateinit var editTextamount: EditText
    private lateinit var buttonsend: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        editTextamount = view.findViewById(R.id.amount)
        buttonsend = view.findViewById(R.id.sendbutton)

        val navController = Navigation.findNavController(view)

        buttonsend.setOnClickListener {
            val amountText = editTextamount.text.toString()

            if (amountText.isEmpty()){
                return@setOnClickListener
            }
            val amount = amountText.toInt()

            val action = fragment1Directions.actionHomeFragmentToDashboardFragment(amount)
            navController.navigate(action)

        }

    }
}