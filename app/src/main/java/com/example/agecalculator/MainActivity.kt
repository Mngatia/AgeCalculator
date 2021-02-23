package com.example.agecalculator

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // val btnDatePicker = findViewById<Button>(R.id.btnDatePicker)
        val btnDatePicker = findViewById<Button>(R.id.btnDatePicker)
        btnDatePicker.setOnClickListener { view ->
        clickDatePicker(view)
        }
    }
  // @RequiresApi(Build.VERSION_CODES.N)
    fun clickDatePicker(view: View) {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

         DatePickerDialog(this,
                DatePickerDialog.OnDateSetListener {
                    view, year, month, dayOfMonth ->
               }, year, month, day).show()
                 Toast.makeText(this,
                         "The chosen year is $year, the month is $month and the day is $day", Toast.LENGTH_LONG).show()
    }

}