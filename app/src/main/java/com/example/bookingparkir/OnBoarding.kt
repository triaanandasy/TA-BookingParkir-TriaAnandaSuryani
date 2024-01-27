package com.example.bookingparkir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OnBoarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        supportActionBar?.hide()

        val btnloginws: Button = findViewById(R.id.btn_loginws)
        val btndaftarws: Button = findViewById(R.id.btn_daftarws)

        btnloginws.setOnClickListener {
            val intent = Intent(this@OnBoarding, LoginActivity::class.java)
            startActivity(intent)
        }

        btndaftarws.setOnClickListener {
            val intent = Intent(this@OnBoarding, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}