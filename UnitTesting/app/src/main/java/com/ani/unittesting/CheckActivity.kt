package com.ani.unittesting

import android.graphics.Color
import android.os.Bundle
import android.widget.CheckBox
import android.widget.FrameLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CheckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_check)

        val fl = findViewById<FrameLayout>(R.id.frameLayout)

        findViewById<CheckBox>(R.id.checkBox).setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) {
                ColorUtil.setRed()
                fl.setBackgroundColor(getIntColor())
            } else {
                ColorUtil.reset()
                fl.setBackgroundColor(getIntColor())
            }
        }
    }

    fun getIntColor() = Color.parseColor(ColorUtil.getColor())
}