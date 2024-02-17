package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnuno = findViewById<Button>(R.id.uno)
        var btndos = findViewById<Button>(R.id.dos)
        var btntres = findViewById<Button>(R.id.tres)
        var btncuatro = findViewById<Button>(R.id.cuatro)
        var btncinco = findViewById<Button>(R.id.cinco)
        var btnseis = findViewById<Button>(R.id.seis)
        var btnsiete = findViewById<Button>(R.id.siete)
        var btnocho = findViewById<Button>(R.id.ocho)
        var btnnueve = findViewById<Button>(R.id.nueve)
        var btncero = findViewById<Button>(R.id.cero)
        var btnmas = findViewById<Button>(R.id.mas)
        var btnmenos = findViewById<Button>(R.id.menos)
        var btnmultiplicar = findViewById<Button>(R.id.multiplicar)
        var btnigual = findViewById<Button>(R.id.igual)
        var pantalla = findViewById<TextView>(R.id.pantalla)
        var numero1: Double = 0.0
        var numero2: Double = 0.0
        var operador: String = ""
        var resultado: Double = 0.0

        btnuno.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "1"
        }

        btndos.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "2"
        }

        btntres.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "3"
        }

        btncuatro.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "4"
        }

        btncinco.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "5"
        }

        btnseis.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "6"
        }

        btnsiete.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "7"
        }

        btnocho.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "8"
        }

        btnnueve.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "9"
        }

        btncero.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "0"
        }

        btnmas.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "+"
            operador = "+"
        }

        btnmenos.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "-"
            operador = "-"
        }

        btnmultiplicar.setOnClickListener {
            pantalla.text = pantalla.text.toString() + "*"
            operador = "*"
        }

        btnigual.setOnClickListener {
            var numeros = pantalla.text.toString().split(operador)
            numero1 = numeros[0].toDouble()
            numero2 = numeros[1].toDouble()
            when(operador){
                "+" -> resultado = numero1 + numero2
                "-" -> resultado = numero1 - numero2
                "*" -> resultado = numero1 * numero2
            }

            pantalla.text = resultado.toString()

        }
    }
}