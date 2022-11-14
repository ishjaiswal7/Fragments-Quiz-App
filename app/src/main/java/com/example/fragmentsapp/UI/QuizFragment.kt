package com.example.fragmentsapp.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragmentsapp.R
import com.example.fragmentsapp.databinding.FragmentHomeBinding
import com.example.fragmentsapp.databinding.FragmentIntroBinding
import com.example.fragmentsapp.databinding.FragmentQuizBinding

class QuizFragment : Fragment() {

    private lateinit var _binding: FragmentQuizBinding
    private val binding get() = _binding  // backing property

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentQuizBinding.inflate(inflater, container, false)
        return  binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }


    }