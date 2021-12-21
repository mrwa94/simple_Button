package com.example.simple_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

     lateinit var edit :EditText
     lateinit var tv : TextView
     lateinit var btn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit = findViewById(R.id.editText)
        tv = findViewById(R.id.textView)
        btn =findViewById(R.id.button)


        btn.setOnClickListener {


            tv.text = " Welcome :   " + edit.text

        }

    }
}