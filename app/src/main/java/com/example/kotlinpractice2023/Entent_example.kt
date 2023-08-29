package com.example.kotlinpractice2023

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class Entent_example : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enplict_intent)
        val intent1 : TextView = findViewById(R.id.intent_one)
        val intent2 : Button = findViewById(R.id.next)
//

        (findViewById<TextView>(R.id.intent_three)).apply {
            this.setOnClickListener {
                val intent =  Intent(this@Entent_example,Intent_two_example :: class.java)
                    //intent.putExtra("extra","data - 1")
                startActivityForResult(intent,1)
            }
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode){
            1->{
                when(resultCode){
                    RESULT_OK ->{
                        val data:String? = data?.extras?.getString("result")
                        Log.d("dataaa",data!!)
                    }
                }
            }
        }
    }
}
