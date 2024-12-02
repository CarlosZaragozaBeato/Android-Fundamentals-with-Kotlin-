package com.carloszaragoza.drag_and_drop

import android.content.ClipData
import android.content.ClipDescription
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.DragEvent
import android.view.View
import android.view.View.OnDragListener
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val topLayout = findViewById<LinearLayout>(R.id.llTop)
        val bottomLayout = findViewById<LinearLayout>(R.id.llBottom)

        val drg2: View.OnDragListener = View.OnDragListener{ view, event ->
            when(event.action){
                DragEvent.ACTION_DRAG_STARTED -> {
                    event.clipDescription.hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)
                }
                DragEvent.ACTION_DRAG_ENTERED -> {
                    view.invalidate()
                    true
                }
                DragEvent.ACTION_DRAG_LOCATION -> true
                DragEvent.ACTION_DRAG_EXITED -> {
                    view.invalidate()
                    true
                }
                DragEvent.ACTION_DROP -> {
                    val item = event.clipData.getItemAt(0)
                    val dragData = item.text
                    Toast.makeText(this, dragData, Toast.LENGTH_SHORT).show()

                    view.invalidate()

                    val v = event.localState as View
                    val owner = v.parent as ViewGroup
                    owner.removeView(v)

                    val destination = view as  LinearLayout
                    destination.addView(v)
                    v.visibility = View.VISIBLE

                    true
                }
                DragEvent.ACTION_DRAG_ENDED ->{
                    view.invalidate()
                    true
                }
                else -> false
            }
        }

       val dView = findViewById<View>(R.id.drag_view)
        dView.setOnLongClickListener{
            val clipText = "This is our clipData Text"
            val item = ClipData.Item(clipText)
            val mimeTypes = arrayOf(ClipDescription.MIMETYPE_TEXT_PLAIN)
            val data = ClipData(clipText, mimeTypes,item)

            val dragShadowBuilder = View.DragShadowBuilder(it)
            it.startDragAndDrop(data, dragShadowBuilder, it, 0)

            it.visibility = View.INVISIBLE

            true
        }
        topLayout.setOnDragListener(drg2)
        bottomLayout.setOnDragListener (drg2)



    }
}