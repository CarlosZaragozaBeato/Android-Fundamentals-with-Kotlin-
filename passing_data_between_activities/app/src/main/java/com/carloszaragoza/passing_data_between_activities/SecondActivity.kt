package com.carloszaragoza.passing_data_between_activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        //val age = intent.getIntExtra("EXTRA_AGE",-1)
        //val country = intent.getStringExtra("EXTRA_COUNTRY")

     val text = findViewById<TextView>(R.id.tvPerson)

        text.text = person.toString()

    }
}