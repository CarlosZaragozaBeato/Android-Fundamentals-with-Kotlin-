package com.carloszaragoza.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btn_change)
        var state:Boolean = false


        val img_1 = findViewById<ImageView>(R.id.imgImag1)
        val img_2 = findViewById<ImageView>(R.id.imgImag2)
        val img_3 = findViewById<ImageView>(R.id.imgImag3)

        button.setOnClickListener{

            val image_1 = R.drawable.luffy
            val image_2 = R.drawable.pokemon
            val image_3 = R.drawable.link


            if(state){
                img_1.setImageResource(image_2)
                img_2.setImageResource(image_3)
                img_3.setImageResource(image_1)
            }else{
                img_2.setImageResource(image_2)
                img_3.setImageResource(image_3)
                img_1.setImageResource(image_1)
            }
            state = !state

        }

    }
}