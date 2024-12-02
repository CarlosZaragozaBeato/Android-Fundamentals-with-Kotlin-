package com.carloszaragoza.shared_preferences

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("CommitPrefEdits")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharePref = getSharedPreferences("my_pref", Context.MODE_PRIVATE)
        val editor = sharePref.edit()

        val btnSave = findViewById<Button>(R.id.btnSave)
        val btnLoad = findViewById<Button>(R.id.btnLoad)

        val etName = findViewById<EditText>(R.id.etName)
        val etAge  = findViewById<EditText>(R.id.etAge)
        val cboxIsAdult = findViewById<CheckBox>(R.id.cbAdult)

        btnSave.setOnClickListener{
            val name = etName.text.toString()
            val age  = etAge.text.toString().toInt()
            val isAdult = cboxIsAdult.isChecked

            editor.apply{
                putString("NAME", name)
                putInt("AGE", age)
                putBoolean("IS_ADULT", isAdult)
                apply()
            }
        }

        btnLoad.setOnClickListener{
            etName.setText(sharePref.getString("NAME", "Default Name"))
            etAge.setText(sharePref.getInt("AGE", -1).toString())
            cboxIsAdult.isChecked = sharePref.getBoolean("IS_ADULT", false)
        }


    }
}