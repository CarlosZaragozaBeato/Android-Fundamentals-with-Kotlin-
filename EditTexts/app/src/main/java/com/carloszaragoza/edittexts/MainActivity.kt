package com.carloszaragoza.edittexts

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var firstValue:EditText
    lateinit var secondValue:EditText


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstValue  = findViewById<EditText>(R.id.edt_firstValue)
        secondValue = findViewById<EditText>(R.id.edt_secondValue)


        val button = findViewById<Button>(R.id.btn_add)
        val result = findViewById<TextView>(R.id.tv_result)
        button.setOnClickListener{
            val firstNumber = firstValue.text.toString().toInt()
            val secondNumber = secondValue.text.toString().toInt()

            val resultado = firstNumber+secondNumber

            result.setText(resultado.toString())


        }
    }
}