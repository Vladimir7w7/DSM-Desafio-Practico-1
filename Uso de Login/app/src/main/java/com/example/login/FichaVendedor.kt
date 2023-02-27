package com.example.login

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.util.Calendar

class FichaVendedor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ficha_vendedor)

        val botoncalcular: Button = findViewById(R.id.btncalcular)


        botoncalcular.setOnClickListener { realizarcalculo() }


        val tv = findViewById<TextView>(R.id.etdate)
        val cal = Calendar.getInstance()
        val myyear = cal.get(Calendar.YEAR)
        val mymonth = cal.get(Calendar.MONTH)
        val day = cal.get(Calendar.DAY_OF_MONTH)

        tv.setOnClickListener {
            val datePickerDialog = DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                    tv.text = "" + dayOfMonth + "/" + (month + 1) + "/" + year
                },
                myyear,
                mymonth,
                day
            )
            datePickerDialog.show()

        }
    }

    private fun realizarcalculo() {

        //capturando el nombre

        val camponombre: EditText = findViewById(R.id.edinombre)
        val campocod: EditText = findViewById(R.id.editcodigo)
        val campoventa: EditText = findViewById(R.id.editventa)


        //val mensajeresult: TextView = findViewById(R.id.txtresult)


        val nombre: String = camponombre.text.toString()
        val cod: String = campocod.text.toString()
        val ventas: Double = campoventa.text.toString().toDouble()
        val ventas1: String = campoventa.text.toString()


        var result = ""

        if (ventas >= 500 && ventas <= 1000) {
            var comi = 0.1

            var total: Double = (ventas * comi)
            result = "$total"
        }
        if (ventas >= 2000 && ventas <= 3000) {
            var comi2 = 0.15
            val total: Double = (ventas * comi2)
            result = "$total"
        }
        if (ventas >= 3000 && ventas <= 4000) {
            val total: Double = (ventas * 0.20)
            result = "$total"
        }
        if (ventas >= 4000) {
            val total: Double = (ventas * 0.30)
            result = "$total"
        }
        //---------abre activity---------------------------------------------


        val intento1 = Intent(this, ResultadoVendedor::class.java)
        intento1.putExtra("res", nombre)
        intento1.putExtra("res1", cod)
        intento1.putExtra("res2", ventas1)
        intento1.putExtra("res3", result)


        startActivity(intento1)

        //------------------------------------------------------
        Toast.makeText(this, "CALCULADO", Toast.LENGTH_LONG).show()
        //mensajeresult.text="Hola $nombre su codigo de usuario es: $cod usted genero una venta mensual de: $ventas y su comision es de: $result"

    }
}



