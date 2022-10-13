package com.example.calculatorexercise

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ShowActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.second_activity)
        val result: String = intent.getIntExtra("result", 0).toString()
        val showResult = findViewById<TextView>(R.id.showResult)

        showResult.text = result
        Toast.makeText(this, result, Toast.LENGTH_LONG).show()


    }

}