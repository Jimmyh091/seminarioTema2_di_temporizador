package com.example.seminariotema2_di_temporizador

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ej3 : AppCompatActivity() {

    lateinit var semaforo : ImageView
    lateinit var boton : Button

    var contador = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej3)

        semaforo = findViewById(R.id.semaforo)
        boton = findViewById(R.id.restart)

        object : CountDownTimer(5000, 1000){

            override fun onTick(millisUntilFinished: Long) {
                when{
                    contador in 1..2 -> semaforo.setImageResource(R.drawable.semaforo_rojo)
                    contador == 3 -> semaforo.setImageResource(R.drawable.semaforo_amarillo)
                    contador in 4..5 -> semaforo.setImageResource(R.drawable.semaforo_verde)
                }
                contador++
            }

            override fun onFinish() {
                semaforo.setImageResource(R.drawable.semaforo_rojo)
            }
        }.start()

        boton.setOnClickListener{
            startActivity(Intent(this, ej1::class.java))
        }
    }
}