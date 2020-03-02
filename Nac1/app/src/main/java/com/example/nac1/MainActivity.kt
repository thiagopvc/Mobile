package com.example.nac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val imagens = intArrayOf(
        R.drawable.p0,
        R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5,
        R.drawable.p6
    )

    var aux = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun anterior(view : View){
        if (aux == 0){
            aux = 6
            imgTroca.setImageResource(imagens[aux])
        }else{
            aux--
            imgTroca.setImageResource(imagens[aux])
        }

    }

    fun proxima(view : View){
        if (aux == 6){
            aux = 0
            imgTroca.setImageResource(imagens[aux])
        }else{
            aux++
            imgTroca.setImageResource(imagens[aux])
        }



    }
}
