package com.example.presentation.ui.splash

import android.content.Intent
import android.os.Handler
import com.example.presentation.R
import com.example.presentation.base.BaseActivity
import com.example.presentation.databinding.ActivitySplashBinding
import com.example.presentation.ui.account.AcountActivity
import com.example.presentation.ui.main.MainActivity


class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {
    override fun init() {
        loadingStart()
    }

    private fun loadingStart() {
        val handler = Handler()
        handler.postDelayed(Runnable {
            val intent = Intent(applicationContext,AcountActivity::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}