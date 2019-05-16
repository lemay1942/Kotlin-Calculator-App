package com.example.ktcalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var result: Int = 0
        var num1: String = ""
        var num2: String = ""
        resultButton.setOnClickListener(View.OnClickListener {
            when(radioGroup.checkedRadioButtonId){
                R.id.radioButton ->
                {
                    num1 = num1Text.text.toString()
                    num2 = num2Text.text.toString()
                    result = num1.toInt() + num2.toInt()
                }
                R.id.radioButton2 ->
                {
                    num1 = num1Text.text.toString()
                    num2 = num2Text.text.toString()
                    result = num1.toInt() - num2.toInt()
                }
                R.id.radioButton3 ->
                {
                    num1 = num1Text.text.toString()
                    num2 = num2Text.text.toString()
                    result = num1.toInt() * num2.toInt()
                }
                R.id.radioButton4 ->
                {
                    num1 = num1Text.text.toString()
                    num2 = num2Text.text.toString()
                    result = num1.toInt() / num2.toInt()
                }
            }
            val intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("result", result.toString())
            startActivity(intent)
        })

    }
}
