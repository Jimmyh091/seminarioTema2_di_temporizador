package com.example.seminariotema2_di_temporizador

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class imagenEj1 : AppCompatActivity() {

    private lateinit var explosion : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagen_ej1)

        explosion = findViewById(R.id.explosion)

        val cambiarActividad = Intent(this, ej2::class.java)

        object : CountDownTimer(1500, 1500){

            override fun onTick(millisUntilFinished: Long) {

            }

            override fun onFinish() {
                startActivity(cambiarActividad)
            }
        }.start()
    }
}