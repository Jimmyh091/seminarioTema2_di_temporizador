package com.example.seminariotema2_di_temporizador

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.Timer

class ej1 : AppCompatActivity() {

    private lateinit var texto : TextView

    private var contador : Long = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej1)

        texto = findViewById(R.id.contador)
        val cambiarActividad = Intent(this, imagenEj1::class.java)

        object : CountDownTimer(contador * 1000, 1000){

            override fun onTick(millisUntilFinished: Long) {
                contador--
                texto.text = contador.toString()
            }

            override fun onFinish() {
                startActivity(cambiarActividad)
            }
        }.start()
    }
}