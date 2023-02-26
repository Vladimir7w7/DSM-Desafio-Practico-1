package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoVendedor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_vendedor)
        val r = findViewById<TextView>(R.id.txtresultado)
        val r2 = findViewById<TextView>(R.id.txtresultado2)
        val r3 = findViewById<TextView>(R.id.txtresultado3)
        val r4 = findViewById<TextView>(R.id.txtresultado4)
        val dato = intent.getStringExtra("res")
        val dato1 = intent.getStringExtra("res1")
        val dato2 = intent.getStringExtra("res2")
        val dato3 = intent.getStringExtra("res3")

        r.setText(
            "Bienvenido "+ dato +""

        )
        r2.setText("Codigo: "+ dato1 +""

        )
        r3.setText("Sus ventas han sido de: $" + dato2 +""

        )
        r4.setText("Su comisión es de: $" + dato3 + ""

        )

        // Toast.makeText(this,dato ,Toast.LENGTH_LONG).show()
    }
    }
