package com.carloszaragoza.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirPlaneModeReceiver:BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneEnable = intent?.getBooleanExtra("state",false)?:return

        if (isAirPlaneEnable){
            Toast.makeText(context, "Enabled", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context, "Disabled", Toast.LENGTH_LONG).show()

        }
    }
}