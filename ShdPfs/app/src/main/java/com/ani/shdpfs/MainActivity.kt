package com.ani.shdpfs

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {

            val prefs = getSharedPreferences("abc", MODE_PRIVATE)
            val editor = prefs.edit()
            editor.putString("color", "red")
            editor.putInt("score", 90)
            editor.putBoolean("isAlive", true)
            editor.apply()
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            val prefs = getSharedPreferences("abc", MODE_PRIVATE)
            val col = prefs.getString("color", "white")
            val sc = prefs.getInt("score", -1)
            val isAl = prefs.getBoolean("isAlive", false)

            findViewById<TextView>(R.id.textView).text = """
                Color = $col,
                Score = $sc,
                iAlive = $isAl
            """.trimIndent()
        }
    }
}