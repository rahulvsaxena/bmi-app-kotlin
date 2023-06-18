package com.example.bmicalulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weightText = findViewById<EditText>(R.id.etWeight)
        val heightText =findViewById<EditText>(R.id.etHeight)
        val submitBtn = findViewById<Button>(R.id.btnSubmit)
        val resultNum = findViewById<TextView>(R.id.tvResult)
        val resultTxt=findViewById<TextView>(R.id.tvResultText)

        submitBtn.setOnClickListener{
            val weight  = weightText.text.toString()
            val height=heightText.text.toString()
            val bmi = (weight.toFloat())/((height.toFloat()/100)*(height.toFloat()/100))
            resultNum.text=bmi.toString()
            if(bmi<18) resultTxt.text="Under Weight"
            else if(bmi>=18.5 && bmi<=24.9 ) resultTxt.text="Normal"
            else resultTxt.text="Over Weight"
        }
    }
}