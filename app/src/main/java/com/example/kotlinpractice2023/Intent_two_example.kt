package com.example.kotlinpractice2023

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Intent_two_example : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intent_two)

        //명시적 인텐트 + 결과받기
        (findViewById<TextView>(R.id.finish)).apply {
            this.setOnClickListener {
                //val intent =  Intent(this@Entent_example,ViewControl_01 :: class.java)
                //intent.putExtra("extra","data - 1")
                //  startActivity(intent)
                //result code는 구분을 하기위함
                val intent : Intent = Intent()
                intent.putExtra("result","success")
                setResult(RESULT_OK,intent)
                finish()
                //  startActivityForResult(intent,1)
            }
        }
    }
}