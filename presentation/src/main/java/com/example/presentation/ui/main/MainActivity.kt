package com.example.presentation.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.presentation.R
import com.example.presentation.base.BaseActivity
import com.example.presentation.databinding.ActivityMainBinding
import com.example.presentation.ui.board.BoardActivity
import com.example.presentation.ui.profile.ProfileActivity

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun init() {
        binding.activity = this
    }

    fun goBoard(view: View) {
        startActivity(Intent(this, BoardActivity::class.java))
    }

    fun goProfile(view: View) {
        startActivity(Intent(this, ProfileActivity::class.java))
    }
}