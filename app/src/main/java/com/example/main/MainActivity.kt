package com.example.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var calenderbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calenderbutton=findViewById(R.id.calenderbutton)

        calenderbutton.setOnClickListener{
            var intent=Intent(this, Calender::class.java)
            startActivity(intent)
        }
    }
}