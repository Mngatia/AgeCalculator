package com.example.agecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker = findViewById(R.id.btnDatePicker) as Button
        btnDatePicker.setOnClickListener { 
            Toast.makeText(this, "Button works", Toast.LENGTH_LONG).show()
        }
    }
}