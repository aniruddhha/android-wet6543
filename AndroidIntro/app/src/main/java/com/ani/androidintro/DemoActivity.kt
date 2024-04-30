package com.ani.androidintro

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DemoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_demo) // convert your xml to java objects and keep in memory

        val txt = findViewById<TextView>(R.id.textView2) // you can access any object from memory via its id

        val btCh = findViewById<Button>(R.id.button3)
//        btCh.setOnClickListener(fun(v) { })
//        btCh.setOnClickListener({})

        btCh.setOnClickListener {
            txt.text = "Hello To Android"
        }

        val btRs = findViewById<Button>(R.id.button4)
        btRs.setOnClickListener {
            txt.text = "TextView"
        }
    }
}