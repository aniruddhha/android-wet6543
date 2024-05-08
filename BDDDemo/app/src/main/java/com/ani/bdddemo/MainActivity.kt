package com.ani.bdddemo

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        val etEml = findViewById<EditText>(R.id.editTextText)

        val etPass = findViewById<EditText>(R.id.editTextText2)

        val txSt = findViewById<TextView>(R.id.textView)

        findViewById<Button>(R.id.button).setOnClickListener {

            if(
                etEml.text.toString() == "abc@g.com" &&
                etPass.text.toString() == "abc"
            ) {
                txSt.text = "SUCCESS"
            } else {
                txSt.text = "FAIL"
            }
        }
    }
}