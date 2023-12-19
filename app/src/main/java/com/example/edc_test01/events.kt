package com.example.edc_test01

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edc_test01.databinding.ActivityEventsBinding
import com.example.edc_test01.databinding.ActivityMainBinding
import com.example.edc_test01.ui.login.LoginActivity

class events : AppCompatActivity() {
    private var binding: ActivityEventsBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEventsBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnRegister?.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}