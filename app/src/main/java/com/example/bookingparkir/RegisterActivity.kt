package com.example.bookingparkir

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        val btnDaftar: Button = findViewById(R.id.btn_daftar)
        val txtPunyaAkun: TextView = findViewById(R.id.txt_punyaakun)

        val username: EditText = findViewById(R.id.edt_nama)
        val password: EditText = findViewById(R.id.text_email)
        val email: EditText = findViewById(R.id.edt_email)

        btnDaftar.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        })

        txtPunyaAkun.setOnClickListener {
            val intent = Intent(this@RegisterActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
