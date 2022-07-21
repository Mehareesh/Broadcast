package com.soumeru.broadcast.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SimpleBroadcast: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isChanged = intent?.getBooleanExtra("state", false) ?: return
        if (isChanged) {
            Toast.makeText(context, "AIRPLANE_MODE enabled...!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "AIRPLANE_MODE disabled...!", Toast.LENGTH_SHORT).show()
        }
    }
}