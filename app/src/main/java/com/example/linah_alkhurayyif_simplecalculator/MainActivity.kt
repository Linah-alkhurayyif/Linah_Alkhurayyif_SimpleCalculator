package com.example.linah_alkhurayyif_simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
        if(firstNumber.text.toString() == "" || secondNumber.text.toString() ==""){
            Toast.makeText(this,"Please enter the both first number and the second number!!",Toast.LENGTH_SHORT).show()
        }else{
            result.text = "${firstNumber.text.toString().toInt()+secondNumber.text.toString().toInt()}"
            firstNumber.setText("")
            secondNumber.setText("")
        }
                }
        minus.setOnClickListener {
            if(firstNumber.text.toString() == "" || secondNumber.text.toString() ==""){
                Toast.makeText(this,"Please enter the both first number and the second number!!",Toast.LENGTH_SHORT).show()
            }else{
                result.text = "${firstNumber.text.toString().toInt()-secondNumber.text.toString().toInt()}"
                firstNumber.setText("")
                secondNumber.setText("")
            }
        }
        multiply.setOnClickListener {
            if(firstNumber.text.toString() == "" || secondNumber.text.toString() ==""){
                Toast.makeText(this,"Please enter the both first number and the second number!!",Toast.LENGTH_SHORT).show()
            }else{
                result.text = "${firstNumber.text.toString().toInt()*secondNumber.text.toString().toInt()}"
                firstNumber.setText("")
                secondNumber.setText("")
            }
        }
        divided.setOnClickListener {
            if(firstNumber.text.toString() == "" || secondNumber.text.toString() ==""){
                Toast.makeText(this,"Please enter the both first number and the second number!!",Toast.LENGTH_SHORT).show()
            }else{
                if(firstNumber.text.toString().toInt() <= 0 || secondNumber.text.toString().toInt() <= 0){
                    Toast.makeText(this,"cannot divide by zero!!",Toast.LENGTH_SHORT).show()
                }else{
                    result.text = "${firstNumber.text.toString().toInt()/secondNumber.text.toString().toInt()}"
                }

                firstNumber.setText("")
                secondNumber.setText("")
            }
        }
    }
}