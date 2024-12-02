package com.carloszaragoza.intents_and_starting_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity:AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btn = findViewById<Button>(R.id.btn_back)

        btn.setOnClickListener{
            Intent(this, MainActivity::class.java).also { intent ->
                startActivity(intent)
            }
        }
    }
}