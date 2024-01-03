package com.example.calculadorabasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    /*fun validation(): Boolean {
        val number1 = findViewById<EditText>(R.id.activity_main_number1)
        val number2 = findViewById<EditText>(R.id.activity_main_number2)

        var isNumber1 = true
        var isNumber2 = true

        number1.error = null
        number2.error = null
        val resultBox = findViewById<EditText>(R.id.activity_main_result)

        if (number1.text.toString().trim().isEmpty()){
            isNumber1 = false
            number1.error = "@string/emptyError"
        }
        if (number2.text.toString().trim().isEmpty()){
            isNumber2 = false
            number2.error = "@string/emptyError"
        }
        return isNumber1&&isNumber2
    }

    fun addition(view: View){
        var test = validation()

        if (test){

        }*/

    fun addition(view: View){
        val number1 = findViewById<EditText>(R.id.activity_main_number1)
        val number2 = findViewById<EditText>(R.id.activity_main_number2)

        var result : BigDecimal
        var isNumber1 = true
        var isNumber2 = true

        number1.error = null
        number2.error = null
        val resultBox = findViewById<EditText>(R.id.activity_main_result)

        if (number1.text.toString().trim().isEmpty()){
            isNumber1 = false
            number1.error = "Campo Requerido"
        }
        if (number2.text.toString().trim().isEmpty()){
            isNumber2 = false
            number2.error = "Campo Requerido"
        }
        if (isNumber1&&isNumber2){
            val value1 = number1.text.toString().trim().toBigDecimal()
            val value2 = number2.text.toString().trim().toBigDecimal()
            result = value1 + value2
            resultBox.setText(result.toString())
        }
    }

    fun subtraction(view: View){
        val number1 = findViewById<EditText>(R.id.activity_main_number1)
        val number2 = findViewById<EditText>(R.id.activity_main_number2)

        var result : BigDecimal
        var isNumber1 = true
        var isNumber2 = true

        number1.error = null
        number2.error = null
        val resultBox = findViewById<EditText>(R.id.activity_main_result)

        if (number1.text.toString().trim().isEmpty()){
            isNumber1 = false
            number1.error = "Campo Requerido"
        }
        if (number2.text.toString().trim().isEmpty()){
            isNumber2 = false
            number2.error = "Campo Requerido"
        }
        if (isNumber1&&isNumber2){
            val value1 = number1.text.toString().trim().toBigDecimal()
            val value2 = number2.text.toString().trim().toBigDecimal()
            result = value1 - value2
            resultBox.setText(result.toString())
        }
    }

    fun multiplication(view: View){
        val number1 = findViewById<EditText>(R.id.activity_main_number1)
        val number2 = findViewById<EditText>(R.id.activity_main_number2)

        var result : BigDecimal
        var isNumber1 = true
        var isNumber2 = true

        number1.error = null
        number2.error = null
        val resultBox = findViewById<EditText>(R.id.activity_main_result)

        if (number1.text.toString().trim().isEmpty()){
            isNumber1 = false
            number1.error = "Campo Requerido"
        }
        if (number2.text.toString().trim().isEmpty()){
            isNumber2 = false
            number2.error = "Campo Requerido"
        }
        if (isNumber1&&isNumber2){
            val value1 = number1.text.toString().trim().toBigDecimal()
            val value2 = number2.text.toString().trim().toBigDecimal()
            result = value1 * value2
            resultBox.setText(result.toString())
        }
    }

    fun division(view: View){
        val number1 = findViewById<EditText>(R.id.activity_main_number1)
        val number2 = findViewById<EditText>(R.id.activity_main_number2)

        var result : BigDecimal
        var isNumber1 = true
        var isNumber2 = true

        number1.error = null
        number2.error = null
        val resultBox = findViewById<EditText>(R.id.activity_main_result)

        if (number1.text.toString().trim().isEmpty()){
            isNumber1 = false
            number1.error = "Campo Requerido"
        }
        if (number2.text.toString().trim().isEmpty()){
            isNumber2 = false
            number2.error = "Campo Requerido"
        }
        if (isNumber1&&isNumber2){
            val value1 = number1.text.toString().trim().toBigDecimal()
            val value2 = number2.text.toString().trim().toBigDecimal()
            if (value2 == BigDecimal.ZERO){
                resultBox.setText("No se puede dividir entre 0")
            }else{
                result = value1 / value2
                resultBox.setText(result.toString())
            }

        }
    }

    fun erase(view: View){
        var box1 = findViewById<EditText>(R.id.activity_main_number1)
        var box2 = findViewById<EditText>(R.id.activity_main_number2)
        var box3 = findViewById<EditText>(R.id.activity_main_result)

        box1.text.clear()
        box2.text.clear()
        box3.text.clear()
    }
}