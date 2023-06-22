package com.company0ne.services

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var startService : Button
    lateinit var startJobIntentService : Button
    lateinit var stopService : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startService = findViewById(R.id.startService)
        startJobIntentService = findViewById(R.id.startJobIntentService)
        stopService = findViewById(R.id.stopService)

        startService.setOnClickListener {

            val intent = Intent(this@MainActivity, ClassicService::class.java)
            startService(intent)

        }
        startJobIntentService.setOnClickListener {

            val intent = Intent(this@MainActivity, JobIntentService::class.java)
            JobIntentService.myBackgroundService(this@MainActivity,intent)

        }
        stopService.setOnClickListener {
            val intent = Intent(this@MainActivity, ClassicService::class.java)
            stopService(intent)

        }

    }

}