package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FormulaCuadratica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formula_cuadratica)
        val a = findViewById<EditText>(R.id.Texta)
        val b = findViewById<EditText>(R.id.Textb)
        val c = findViewById<EditText>(R.id.Textc)
        val r = findViewById<TextView>(R.id.Textresultado)
        val r2 = findViewById<TextView>(R.id.Textresultado2)
        val exp = 2
        val btnrespuesta = findViewById<Button>(R.id.btnsumar)
        btnrespuesta.setOnClickListener {
            // val prueba = (a.text.toString().toDouble()) * ( c.text.toString().toDouble())
            if (a.getText().toString().isEmpty() || b.getText().toString()
                    .isEmpty() || c.getText().toString().isEmpty()
            ) {
                Toast.makeText(this, "LLene todos los campos", Toast.LENGTH_LONG).show()
            }
            else{
                val n = Math.pow((b.text.toString().toDouble()), (exp.toString().toDouble()))
                val n2 = (n - ((4) * (a.text.toString().toDouble()) * (c.text.toString().toDouble())))
                val n1 = Math.sqrt(n2)
                val n3 = (-b.text.toString().toDouble()) + (n1.toString().toDouble())
                val n4 = (-b.text.toString().toDouble()) - (n1.toString().toDouble())
                val n5 = (n3) / (2 * (a.text.toString().toDouble()))
                val n6 = n4 / (2 * (a.text.toString().toDouble()))




                if (n2 > 0) {
                    r.setText(
                        "Valor de x1: " + (Math.round(n5 * 1000.0) / 1000.0)
                    )
                    r2.setText(
                        "Valor de x2: " + (Math.round(n6 * 1000.0) / 1000.0)
                    )
                }
                else
                {
                    val text = "No existe solución"
                    val duration = Toast.LENGTH_SHORT

                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()

                }

            }
            }

    }
}