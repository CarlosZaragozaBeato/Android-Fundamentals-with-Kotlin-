package com.carloszaragoza.textviews

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener(this)


    }

    @SuppressLint("SetTextI18n")
    override fun onClick(p0: View?) {
        val text = findViewById<TextView>(R.id.text)
        counter++
        text.setText("Counter: ${counter}")
    }
}