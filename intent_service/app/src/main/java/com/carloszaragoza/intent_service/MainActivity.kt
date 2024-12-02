package com.carloszaragoza.intent_service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.btnStart)
        val stop = findViewById<Button>(R.id.btnStop)

        val text = findViewById<TextView>(R.id.tvServiceStatus)

        start.setOnClickListener {
            Intent(this, MyIntentSevice::class.java).also {
                startService(it)
                text.text = "Service Running"
            }
        }

        stop.setOnClickListener{
            MyIntentSevice.stopService()
            text.text = "Service Stop"
        }

    }
}