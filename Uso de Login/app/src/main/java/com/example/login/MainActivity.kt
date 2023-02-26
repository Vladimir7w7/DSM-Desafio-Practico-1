package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btninit = findViewById<Button>(R.id.btninit)
        btninit.setOnClickListener {
            val intento1 = Intent(this, ResultActivity::class.java)

            startActivity(intento1)
        }
    }
}