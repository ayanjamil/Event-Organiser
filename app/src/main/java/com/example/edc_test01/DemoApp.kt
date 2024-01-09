package com.example.edc_test01

import android.app.Application

class DemoApp: Application() {
    val db by lazy {
        eventDatabase.getInstance(this)
    }
}