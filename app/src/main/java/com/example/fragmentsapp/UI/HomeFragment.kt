package com.example.fragmentsapp.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.fragmentsapp.R
import com.example.fragmentsapp.databinding.FragmentHomeBinding
import com.example.fragmentsapp.databinding.FragmentIntroBinding

class HomeFragment : Fragment() {

    private lateinit var _binding: FragmentHomeBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnStart.setOnLongClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_quizFragment)
            true
        }

        val bundle = HomeFragmentArgs.fromBundle(requireArguments())
        binding.textUsename.text = getString(
            R.string.username_display,
            bundle.username
        )
    }

}