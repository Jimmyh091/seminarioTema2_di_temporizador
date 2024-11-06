package com.example.seminariotema2_di_temporizador

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ej2 : AppCompatActivity() {

    lateinit var carta1 : ImageView
    lateinit var carta2 : ImageView
    lateinit var carta3 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej2)

        carta1 = findViewById(R.id.imageView)
        carta2 = findViewById(R.id.imageView2)
        carta3 = findViewById(R.id.imageView3)

        var bocaArriba1 = true
        var bocaArriba2 = true
        var bocaArriba3 = true

        carta1.setOnClickListener{
            if (bocaArriba1){
                carta1.setImageResource(R.drawable.cartaatras)
            }else{
                carta1.setImageResource(R.drawable.carta1)
            }
            bocaArriba1 = !bocaArriba1
        }

        carta2.setOnClickListener{
            if (bocaArriba2){
                carta2.setImageResource(R.drawable.cartaatras)
            }else{
                carta2.setImageResource(R.drawable.carta2)
            }
            bocaArriba2 = !bocaArriba2
        }

        carta3.setOnClickListener{
            if (bocaArriba3){
                carta3.setImageResource(R.drawable.cartaatras)
            }else{
                carta3.setImageResource(R.drawable.carta3)
            }
            bocaArriba3 = !bocaArriba3
        }

        val cambiarActividad = Intent(this, ej3::class.java)

        object : CountDownTimer(10000, 10000){

            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                startActivity(cambiarActividad)
            }
        }.start()

    }
}