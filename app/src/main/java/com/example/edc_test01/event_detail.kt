package com.example.edc_test01

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi

class event_detail : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_detail)
        val event = intent.getParcelableExtra("event",event_model::class.java)
        if (event!=null){
            val imageView :ImageView=findViewById(R.id.event_imagview)
            val eventName :TextView=findViewById(R.id.tv_eventname)
            imageView.setImageResource(event.image)
            eventName.text=event.tv_heading
        }
        else
            Log.d("event_details issue","when the if block is not executed in event_datials secton")

    }
}