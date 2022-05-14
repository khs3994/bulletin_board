package com.example.presentation.ui.board

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.presentation.R
import com.example.presentation.base.BaseActivity
import com.example.presentation.databinding.ActivityBoardBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BoardActivity : BaseActivity<ActivityBoardBinding>(R.layout.activity_board) {

    private val write by lazy { WriteFragment() }
    private val board by lazy { BoardFragment() }

    override fun init() {
        initBottomNav()
    }

    private fun initBottomNav() {
        binding.bottomNav.run {
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.first -> {
                        changeFragment(board)
                    }
                    R.id.second -> {
                        changeFragment(write)
                    }
                }
                true
            }
            selectedItemId = R.id.first
        }
    }

    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(binding.fragmentContainer.id, fragment)
            .commit()
    }

}
