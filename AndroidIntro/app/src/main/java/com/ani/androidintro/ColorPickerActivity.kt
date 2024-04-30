package com.ani.androidintro

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

data class ColVal(
    var red: Int,
    var green: Int,
    var blue: Int
)

class ColorPickerActivity : AppCompatActivity() {

    private val colVal : ColVal = ColVal(0, 0, 0)

    private val sbChLs = object : OnSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

            when(seekBar?.id) {
                R.id.seekBar5 -> {
                    Log.i("ColorPicker", "Red $progress")
                    colVal.red = progress
                }
                R.id.seekBar4 -> {
                    Log.i("ColorPicker", "Green $progress")
                    colVal.green = progress
                }
                R.id.seekBar6 -> {
                    Log.i("ColorPicker", "Blue $progress")
                    colVal.blue = progress
                }
            }

            val fL = findViewById<FrameLayout>(R.id.frameLayout)
            fL.setBackgroundColor(Color.rgb(colVal.red, colVal.green, colVal.blue))

            val txt = findViewById<TextView>(R.id.textView4)
            txt.text = "rgb(${colVal.red}, ${colVal.green}, ${colVal.blue})"
        }

        override fun onStartTrackingTouch(seekBar: SeekBar?) {
        }

        override fun onStopTrackingTouch(seekBar: SeekBar?) {
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_color_picker)

        val fL = findViewById<FrameLayout>(R.id.frameLayout)
        fL.setBackgroundColor(Color.rgb(255, 0, 0))

        val skRd = findViewById<SeekBar>(R.id.seekBar5)
        skRd.setOnSeekBarChangeListener(sbChLs)
        val skGn = findViewById<SeekBar>(R.id.seekBar4)
        skGn.setOnSeekBarChangeListener(sbChLs)
        val skBl = findViewById<SeekBar>(R.id.seekBar6)
        skBl.setOnSeekBarChangeListener(sbChLs)
    }
}