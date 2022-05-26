package com.max.moscowmanors.domain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import com.max.moscowmanors.R

class PrivacyPolicyMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_policy_menu)

        val googleDoc:TextView = findViewById(R.id.priv_8)

        googleDoc.movementMethod = LinkMovementMethod.getInstance()
    }
}