package com.example.bookingparkir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    private lateinit var btnSignIn: Button
    private lateinit var txtView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val txt_register: TextView = findViewById(R.id.register)
        val btn_login: Button = findViewById(R.id.btn_login)

        val username: EditText = findViewById(R.id.edt_username)
        btnSignIn = findViewById(R.id.btn_login)
        txtView = findViewById(R.id.txt_akunbaru)

        btn_login.setOnClickListener {
            val intent = Intent(this@LoginActivity, MainActivity::class.java)
            startActivity(intent)
        }
        txt_register.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
