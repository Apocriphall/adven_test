package com.kachaninc.adventureofcrazymage.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.kachaninc.adventureofcrazymage.R
import com.kachaninc.adventureofcrazymage.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private val binding by lazy { FragmentMainBinding.inflate(layoutInflater) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            binding.button.setOnClickListener {
            Toast.makeText(requireContext(), "on", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_mainFragment_to_gameFragment)
        }

      //   requireActivity().findViewById<TextView>(R.id.buttonRules)

    }


}