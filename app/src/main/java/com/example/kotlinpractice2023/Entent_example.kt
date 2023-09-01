package com.example.kotlinpractice2023

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import org.w3c.dom.Text

class Entent_example : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.enplict_intent)
        val intent1 : TextView = findViewById(R.id.intent_one)
        val intent2 : Button = findViewById(R.id.next)
//

        val startActivityLauncher : ActivityResultLauncher<Intent> = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ){
            (findViewById<TextView>(R.id.intent_four)).apply {
                when(it.resultCode){
                    RESULT_OK->{
                        Log.d("dataa",it.data?.extras?.getString("result")!!)
                    }
                }

                this.setOnClickListener {
                    val intent =  Intent(this@Entent_example,Intent_two_example :: class.java)
                }
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
