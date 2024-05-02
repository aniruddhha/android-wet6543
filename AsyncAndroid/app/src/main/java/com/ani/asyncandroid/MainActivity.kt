package com.ani.asyncandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private val scope = CoroutineScope(Job() + Dispatchers.Main)

    private fun demoMainNewThread() {
        val txt = findViewById<TextView>(R.id.txtVw)

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            Thread {
                for (i in 0..10) {
                    Thread.sleep(2000)
//                    txt.text = "$i"
                }
            }.start()
        }
    }

    private fun bestWayForAsync() {
        val txt = findViewById<TextView>(R.id.txtVw)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener {
            val job: Job = scope.launch {
               execute(txt)
            }

            val t1: Job = scope.launch {

                val t2: Deferred<Int> = scope.async {
                    return@async 3
                }
                t2.await()
            }
        }
    }

    suspend fun execute(txt :TextView) {
        for (i in 1..10) {
            delay(2000)
            txt.text = "$i"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        bestWayForAsync()

    }
}