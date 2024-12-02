package com.carloszaragoza.swipable_views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tab = findViewById<TabLayout>(R.id.tabLayout)
        val vp = findViewById<ViewPager2>(R.id.viewPager)
        val listImages = listOf<Int>(R.drawable.a, R.drawable.a, R.drawable.a)
        val adapter = ViewPagerAdapter(listImages)

        vp.adapter = adapter


        TabLayoutMediator(tab, vp){tab, position->
            tab.text = "Tab ${position+1}"
        }.attach()

        tab.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "${tab?.text}",Toast.LENGTH_SHORT).show()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "${tab?.text}",Toast.LENGTH_SHORT).show()

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                Toast.makeText(this@MainActivity, "${tab?.text}",Toast.LENGTH_SHORT).show()

            }
        })
    }
}