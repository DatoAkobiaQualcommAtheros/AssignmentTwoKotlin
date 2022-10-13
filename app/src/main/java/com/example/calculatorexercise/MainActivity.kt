package com.example.calculatorexercise

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adding = findViewById<Button>(R.id.button_add)
        val dividing = findViewById<Button>(R.id.button_divide)
        val multiply = findViewById<Button>(R.id.button_multiply)
        val subtract = findViewById<Button>(R.id.button_subtract)


        adding.setOnClickListener {
            val firstNum = findViewById<TextView>(R.id.edit_first_num).text.toString()
            val secondNum = findViewById<TextView>(R.id.edit_second_num).text.toString()
            val extraArg = firstNum.toInt() + secondNum.toInt()
            val changeActivity = Intent(this, ShowActivity::class.java)
            changeActivity.putExtra("result", extraArg)
            startActivity(changeActivity)

        }

        dividing.setOnClickListener {
            val firstNum = findViewById<TextView>(R.id.edit_first_num).text.toString()
            val secondNum = findViewById<TextView>(R.id.edit_second_num).text.toString()
            val extraArg = firstNum.toInt() / secondNum.toInt()
            val changeActivity = Intent(this, ShowActivity::class.java)
            changeActivity.putExtra("result", extraArg)
            startActivity(changeActivity)

        }

        multiply.setOnClickListener {
            val firstNum = findViewById<TextView>(R.id.edit_first_num).text.toString()
            val secondNum = findViewById<TextView>(R.id.edit_second_num).text.toString()
            val extraArg = firstNum.toInt() * secondNum.toInt()
            val changeActivity = Intent(this, ShowActivity::class.java)
            changeActivity.putExtra("result", extraArg)
            startActivity(changeActivity)
        }

        subtract.setOnClickListener {
            val firstNum = findViewById<TextView>(R.id.edit_first_num).text.toString()
            val secondNum = findViewById<TextView>(R.id.edit_second_num).text.toString()
            val extraArg = firstNum.toInt() - secondNum.toInt()
            val changeActivity = Intent(this, ShowActivity::class.java)
            changeActivity.putExtra("result", extraArg)
            startActivity(changeActivity)
        }



    }

}
