package com.max.moscowmanors.domain

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.max.moscowmanors.ui.MainActivity

class SplashScreen : AppCompatActivity() {
    companion object {
        const val CONSTANTA = "isPressed"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val sharedPrefButton = getSharedPreferences(CONSTANTA, Context.MODE_PRIVATE)

        val isPressed = sharedPrefButton.getBoolean("isPressed", true)

        val editors: SharedPreferences.Editor = sharedPrefButton.edit()

            if (isPressed){
                val intent = Intent(this, PrivacyPolicy::class.java)
                startActivity(intent)
                finish()

            }else{
                editors.putBoolean("isPressed", false)
                editors.apply()

                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
    }
}