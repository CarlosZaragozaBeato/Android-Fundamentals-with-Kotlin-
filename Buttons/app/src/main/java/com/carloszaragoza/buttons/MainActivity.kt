package com.carloszaragoza.buttons

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.chip.Chip

class MainActivity : AppCompatActivity(), View.OnClickListener,
    CompoundButton.OnCheckedChangeListener {



    @SuppressLint("UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val sw = findViewById<Switch>(R.id.switch1)
        val tg = findViewById<ToggleButton>(R.id.toggleButton)
        val ch = findViewById<Chip>(R.id.chip4)
        val cbox = findViewById<CheckBox>(R.id.checkBox)

        button.setOnClickListener(this)
        sw.setOnCheckedChangeListener(this)
        tg.setOnCheckedChangeListener(this)
        ch.setOnClickListener(this)
        cbox.setOnCheckedChangeListener(this)

    }

    override fun onClick(p0: View?) {
        val id = p0?.getId()

        when(id){
            R.id.chip4 -> Toast.makeText(this, "Chip", Toast.LENGTH_SHORT).show()
            R.id.button -> Toast.makeText(this, "Button", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {

        val idButton = p0?.getId()

        when(idButton){
            R.id.switch1 -> {
                if(p1){
                    Toast.makeText(this, "Selected Switch", Toast.LENGTH_SHORT).show()
                }else{
                    Toast.makeText(this, "UnSelected Switch", Toast.LENGTH_SHORT).show()
                }
            }


             R.id.checkBox -> {
                 if(p1){
                     Toast.makeText(this, "Selected checkBox", Toast.LENGTH_SHORT).show()
                 }else{
                     Toast.makeText(this, "UnSelected checkBox", Toast.LENGTH_SHORT).show()
                 }
             }
             R.id.toggleButton ->  {
                 if(p1){
                     Toast.makeText(this, "Selected toggleButton", Toast.LENGTH_SHORT).show()
                 }else{
                     Toast.makeText(this, "UnSelected toggleButton", Toast.LENGTH_SHORT).show()
                 }
             }


        }

    }
}