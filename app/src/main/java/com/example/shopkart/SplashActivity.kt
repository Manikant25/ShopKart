package com.example.shopkart

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.shopkart.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        // Adding the handler to after the a task after some delay.
        // It is deprecated in the API level 30.
        Handler().postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java))
                // Launch the Login Activity
                finish() // Call this when your activity is done and should be closed.
            },
            2500
        ) // Here we pass the delay time in milliSeconds after which the splash activity will disappear.

//        val typeface = Typeface.createFromAsset(this.assets, "Montserrat-Regular.ttf")
//        binding.appName.typeface = typeface
    }
}
