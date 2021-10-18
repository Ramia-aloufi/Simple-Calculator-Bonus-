package com.example.simplecalculatorbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    lateinit var et1:EditText
    lateinit var et2:EditText
    lateinit var btnsum:Button
    lateinit var btnmin:Button
    lateinit var btnmul:Button
    lateinit var btndiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView)
        et1 = findViewById(R.id.editTextTextPersonName)
        et2 = findViewById(R.id.editTextTextPersonName2)
        btnsum = findViewById(R.id.button)
        btnmin = findViewById(R.id.button2)
        btnmul = findViewById(R.id.button3)
        btndiv = findViewById(R.id.button4)

        btnsum.setOnClickListener {tv.text = operation("+").toString() }
        btnmin.setOnClickListener {tv.text = operation("-").toString()}
        btnmul.setOnClickListener {tv.text = operation("*").toString()}
        btndiv.setOnClickListener {tv.text = operation("/").toString()}
    }

    fun operation(op:String):Int {
        var a = et1.text.toString().toInt()
        val b = et2.text.toString().toInt()
        var c = 0
        when (op) {
          "+" ->  c = a + b
          "-" ->  c = a - b
          "*" ->  c = a * b
          "/" ->  c = a / b
            else -> c = 0
        }

        et1.text.clear()
        et2.text.clear()
        return c
    }
}