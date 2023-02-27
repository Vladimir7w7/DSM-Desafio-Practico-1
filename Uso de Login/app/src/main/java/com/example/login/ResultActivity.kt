package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val btnecua = findViewById<Button>(R.id.btnecua)

        btnecua.setOnClickListener {
            val intento1 = Intent(this, FormulaCuadratica::class.java)
            startActivity(intento1)
        }
        val btnvendedor = findViewById<Button>(R.id.btnventas)
        btnvendedor.setOnClickListener {
            val intento1 = Intent(this, FichaVendedor::class.java)
            startActivity(intento1)

            

            }
        }
    }
