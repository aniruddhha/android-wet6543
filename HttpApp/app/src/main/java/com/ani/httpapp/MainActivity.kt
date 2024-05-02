package com.ani.httpapp

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    lateinit var retrofit: Retrofit

    val mainScope : CoroutineScope = CoroutineScope(Job() + Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        retrofit = RetrofitClient.create()
        val intfc = retrofit.create(CRUDApp::class.java)

        val txt = findViewById<TextView>(R.id.txt)


        mainScope.launch {
            val response = intfc.sakjkajsfhkjashfbd()

            val app: App? = response.body()
            Log.i("@HttpApp", "App Id : ${app?.id} , Cnt : ${app?.cnt}")
            txt.text = "${app?.id} , Cnt : ${app?.cnt}"
        }
    }
}