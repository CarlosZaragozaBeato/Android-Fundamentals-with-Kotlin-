package com.carloszaragoza.toast_and_context

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.btn_show_toast)


        button.setOnClickListener{
            //Toast.makeText(this, "Hi, I'm a toast", Toast.LENGTH_SHORT).show()
            val layout = findViewById<ConstraintLayout>(R.id.clToast)

            Toast(this).apply{
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.custom_toast,layout)
                show()
            }
        }
    }
}