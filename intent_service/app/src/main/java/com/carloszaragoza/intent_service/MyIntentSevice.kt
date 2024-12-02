package com.carloszaragoza.intent_service

import android.app.IntentService
import android.content.Intent
import android.util.Log

class MyIntentSevice: IntentService("MyItentService") {

    init{
        instance = this
    }

    companion object {
        private lateinit var instance:MyIntentSevice
        var isRunning = false

        fun stopService(){
            Log.d("IntentService", "My Intent Service: Stop")
            isRunning = false
            instance.stopSelf()
        }
    }


    @Deprecated("Deprecated in Java")
    override fun onHandleIntent(p0: Intent?) {
        try{
            isRunning = true
            while(isRunning){
                Log.d("IntentService", "My Intent Service: Running")
                Thread.sleep(1000)
            }
        }catch (e:InterruptedException) {Thread.currentThread().interrupt()}
    }
}