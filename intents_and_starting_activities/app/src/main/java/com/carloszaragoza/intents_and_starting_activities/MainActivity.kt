package com.carloszaragoza.intents_and_starting_activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn_open_activity)
        btn.setOnClickListener{
            Intent(this, SecondActivity::class.java).also { intent ->
                startActivity(intent)
            }
        }
    }
}