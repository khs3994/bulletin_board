package com.example.presentation.ui.account

import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentSignupBinding
import com.example.presentation.ui.viewmodel.AccountViewModel


class SignupFragment : BaseFragment<FragmentSignupBinding>(R.layout.fragment_signup) {

    private val vm by activityViewModels<AccountViewModel>()

    override fun init() {
        binding.fragment = this
    }

    fun signUp(view: View) {
        if (binding.userEmailEdtxt.text.isNotEmpty() && binding.userPwEdtxt.text.isNotEmpty()) {
            vm.signUp(binding.userEmailEdtxt.text.toString(), binding.userPwEdtxt.text.toString())
        } else {
            shortShowToast("이메일과 비밀번호를 전부 작성해 주세요")
        }
        this.findNavController().popBackStack()
    }

    fun goBack(view: View) {
        this.findNavController().popBackStack()
    }
}