package com.example.shopkart.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.shopkart.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_acitivity)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
    }
}