package com.kachaninc.adventureofcrazymage.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.kachaninc.adventureofcrazymage.R
import com.kachaninc.adventureofcrazymage.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonRules.setOnClickListener {
            Toast.makeText(requireContext(), "on", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.action_mainFragment_to_gameFragment)
        }
    }
}