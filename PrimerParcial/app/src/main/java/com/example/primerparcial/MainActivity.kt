package com.example.primerparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add.setOnClickListener{
            if (!input1.text.isEmpty() && !input3.getText().toString().isEmpty() && !input2.getText().toString().isEmpty() )
            {
                Result.append("\n")
                Result.append(input1.text)
                Result.append("+")
                Result.append(input2.text)
                Result.append("=")
                Result.append(input3.text)
                input1.setText("")
                input2.setText("")
                input3.setText("")
            }
            else{
            }
        }
        clear.setOnClickListener{
            input1.setText("")
            input2.setText("")
            input3.setText("")
            Result.setText("")
        }
    }
}