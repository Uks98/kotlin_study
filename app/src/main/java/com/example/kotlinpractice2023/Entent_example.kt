package com.example.kotlinpractice2023

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Entent_example : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enplict_intent)
        val intent1 : TextView = findViewById(R.id.intent_one)
        val intent2 : Button = findViewById(R.id.next)
//


        (findViewById<TextView>(R.id.intent_one)).apply {
            this.setOnClickListener {
                startActivity(
                    Intent(this@Entent_example,MainActivity :: class.java)
                )
                print("A")
            }
        }
        intent2.setOnClickListener {
            startActivity(
                Intent(this@Entent_example,MainActivity :: class.java)
            )
        }

    }}
