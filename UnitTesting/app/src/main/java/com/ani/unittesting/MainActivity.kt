package com.ani.unittesting

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        val et = findViewById<EditText>(R.id.editTextText)
        findViewById<Button>(R.id.button).setOnClickListener {
            et.setText(et.text.toString().uppercase())
        }
    }
}