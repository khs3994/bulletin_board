package com.example.presentation.ui.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentSignupBinding


class SignupFragment : BaseFragment<FragmentSignupBinding>(R.layout.fragment_signup) {
    override fun init() {
        binding.fragment = this
    }

    fun goBack(view: View){
        this.findNavController().popBackStack()
    }
}