package com.example.kotlinpractice2023

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ViewControl_01 : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_control01)
        val viewText : TextView = findViewById(R.id.view_number)
        val reset : Button = findViewById(R.id.reset)
        val plus : Button = findViewById(R.id.plus)
        val sum : Button = findViewById(R.id.sum)
        val button0 : Button = findViewById(R.id.num0)
        val button1 : Button = findViewById(R.id.num1)
        val button2 : Button = findViewById(R.id.num2)
        val button3 : Button = findViewById(R.id.num3)
        val button4 : Button = findViewById(R.id.num4)
        val button5 : Button = findViewById(R.id.num5)
        val button6 : Button = findViewById(R.id.num6)
        val button7 : Button = findViewById(R.id.num7)
        val button8 : Button = findViewById(R.id.num8)
        val button9 : Button = findViewById(R.id.num9)
        var numbers : String = ""
        var saveNum : String = ""
        var res : String = ""

        plus.setOnClickListener {
            saveNum = numbers
            numbers = ""
            viewText.text = ""
        }
        sum.setOnClickListener {
            viewText.text = (saveNum.toInt() + numbers .toInt()).toString()
        }
        reset.setOnClickListener {
            viewText.text = ""
            saveNum = ""
            numbers = ""
        }
        button0.setOnClickListener {
            numbers += button0.text.toString()
            viewText.text = numbers
        }
        button1.setOnClickListener {
            numbers += button1.text.toString()
            viewText.text = numbers
        }

        button2.setOnClickListener {
            numbers += button2.text.toString()
            viewText.text = numbers
        }
        button3.setOnClickListener {
            numbers += button3.text.toString()
            viewText.text = numbers
        }
        button4.setOnClickListener {
            numbers += button4.text.toString()
            viewText.text = numbers
        }
        button5.setOnClickListener {
            numbers += button5.text.toString()
            viewText.text = numbers
        }
        button6.setOnClickListener {
            numbers += button6.text.toString()
            viewText.text = numbers
        }
        button7.setOnClickListener {
            numbers += button7.text.toString()
            viewText.text = numbers
        }
        button8.setOnClickListener {
            numbers += button8.text.toString()
            viewText.text = numbers
        }
        button9.setOnClickListener {
            numbers += button9.text.toString()
            viewText.text = numbers
        }
    }
}