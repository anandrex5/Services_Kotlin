package com.company0ne.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class ClassicService : Service() {
    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d("Service", "Service is created")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        //if we want to perform any operations we done it here.
        Log.d("Service", "Service is started")
        Log.d("Service Thread", Thread.currentThread().name)

        //if we want to stop any service automatically
        //stopSelf()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service", "Service is stopped")
    }
}