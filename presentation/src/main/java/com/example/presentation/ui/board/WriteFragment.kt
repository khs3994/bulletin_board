package com.example.presentation.ui.board

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.presentation.R
import com.example.presentation.base.BaseFragment
import com.example.presentation.databinding.FragmentWirteBinding

class WriteFragment : BaseFragment<FragmentWirteBinding>(R.layout.fragment_wirte) {
    override fun init() {
        shortShowToast("글쓰기")
    }
}