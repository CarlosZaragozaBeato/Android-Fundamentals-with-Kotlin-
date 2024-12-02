package com.carloszaragoza.cbox_rbutton

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOrder = findViewById<Button>(R.id.button_order)
        val rg_meat = findViewById<RadioGroup>(R.id.rg_Meat)
        val text = findViewById<TextView>(R.id.tv_order)

        buttonOrder.setOnClickListener{
            val checkedMeatRadioButton = rg_meat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButton)
            val cheese = findViewById<CheckBox>(R.id.cb_cheese).isChecked
            val salad = findViewById<CheckBox>(R.id.cb_salad).isChecked
            val onions = findViewById<CheckBox>(R.id.cb_onions).isChecked
            text.setText("You ordered a burger with: \n" +
                    "${meat.text}" +
                    (if(cheese)"\ncheese" else "") +
                    (if(salad)"\nsalad" else "") +
                    (if(onions)"\nonions" else "")
            )

        }
    }
}