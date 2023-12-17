package com.example.edc_test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edc_test01.databinding.ActivityEvents2Binding
import com.example.edc_test01.databinding.ActivityEventsBinding
import com.example.edc_test01.ui.login.LoginActivity

class events2 : AppCompatActivity() {
    private var binding: ActivityEvents2Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.onCreate(savedInstanceState)
        binding = ActivityEvents2Binding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnRegister?.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}