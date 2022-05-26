package com.max.moscowmanors.domain

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.max.moscowmanors.R
import com.max.moscowmanors.ui.MainActivity

class PrivacyPolicy : AppCompatActivity() {
    companion object {
        const val CONSTANTA = "isPressed"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_policy)

        val accept: Button = findViewById(R.id.accept)
        val refuse: Button = findViewById(R.id.refuse)

        val sharedPrefButton = getSharedPreferences(CONSTANTA, Context.MODE_PRIVATE)

        //val isPressed = sharedPrefButton.getBoolean("isPressed", false)

        val editors: SharedPreferences.Editor = sharedPrefButton.edit()

        accept.setOnClickListener {

            editors.putBoolean("isPressed", false)
            editors.apply()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

        }
        refuse.setOnClickListener {
            finish()

        }
    }
}

