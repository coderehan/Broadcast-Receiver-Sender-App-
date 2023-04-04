package com.cipl.broadcastreceiversenderpart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// Sender App

class MainActivity : AppCompatActivity() {

    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.btnSend)

        button?.setOnClickListener{
            // We will send data on this button click and our receiver app will receive data
            val intent = Intent("com.cipl.broadcastreceiversenderpart.ACTION_SEND")     // This is package name of app which is unique
            intent.putExtra("com.cipl.broadcastreceiversenderpart.EXTRA_DATA", "Sender sending data")   // Sending some data in value
            sendBroadcast(intent)
        }
    }
}