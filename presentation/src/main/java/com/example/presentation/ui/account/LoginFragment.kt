package com.example.presentation.ui.account

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentLoginBinding
import com.example.presentation.ui.main.MainActivity


class LoginFragment : BaseFragment<FragmentLoginBinding>(R.layout.fragment_login) {
    override fun init() {
        binding.fragment = this
    }

    fun goSignup(view: View){
        this.findNavController().navigate(R.id.action_loginFragment_to_signupFragment)
    }

    fun goMain(view: View){
        startActivity(Intent(activity, MainActivity::class.java))
    }
}