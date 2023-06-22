package com.company0ne.services

import android.content.Context
import android.content.Intent
import android.util.Log

import androidx.core.app.JobIntentService

class JobIntentService : JobIntentService() {

    override fun onHandleWork(intent: Intent) {
        Log.d("Service", "Job IntentService is started")
        Log.d("Service Thread", Thread.currentThread().name)
    }

    //we can access function directly using the class name
    //java intent not using main thread
    companion object {
        fun myBackgroundService(context: Context, intent: Intent) {
            enqueueWork(context,com.company0ne.services.JobIntentService::class.java, 1, intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Service","Job intent Service is stopped.")
    }
}