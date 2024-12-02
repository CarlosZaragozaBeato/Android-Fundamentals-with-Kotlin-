package com.carloszaragoza.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var todosList = mutableListOf<Todo>(
            Todo(title = "First Title"),
            Todo(title = "Second Title"),
            Todo(title = "Third Title"),
            Todo(title = "Fourth Title",
                    isDone = true)
        )

        val rv = findViewById<RecyclerView>(R.id.rvTodos)
        val adapter = ToDoAdapter(todosList)
        rv.adapter = adapter
        rv.layoutManager = LinearLayoutManager(this)


        val button = findViewById<Button>(R.id.btnAdd)
        button.setOnClickListener{
            val text = findViewById<EditText>(R.id.etTodo)

            if(text.text.isNotEmpty()){
                todosList.add(Todo(text.text.toString()))
                adapter.notifyItemInserted(todosList.size-1)
            }

        }
    }
}