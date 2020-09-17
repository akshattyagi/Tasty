package com.example.tasty.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tasty.R

class SplashActivity : AppCompatActivity() {


    lateinit var txttasty: TextView
    lateinit var imgAppIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_splash)

        this.window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)


        txttasty = findViewById(R.id.txtTasty)
        imgAppIcon = findViewById(R.id.imgAppIcon)




        Handler().postDelayed({
            val mainIntent =
                Intent(this@SplashActivity, LoginRegisterActivity::class.java)
            finish()
            startActivity(mainIntent)
        }, 2000)
    }
}
