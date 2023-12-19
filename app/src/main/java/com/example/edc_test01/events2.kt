package com.example.edc_test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.edc_test01.databinding.ActivityEvents2Binding
import com.example.edc_test01.databinding.ActivityEventsBinding
import com.example.edc_test01.ui.login.LoginActivity

class events2 : AppCompatActivity() {
    private var binding2: ActivityEvents2Binding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding2 = ActivityEvents2Binding.inflate(layoutInflater)
        setContentView(binding2?.root)
        binding2?.btnRegister2?.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "button_2 pressed", Toast.LENGTH_LONG).show()

        }
    }
    override fun onDestroy() {
        super.onDestroy()
        binding2 = null
    }
}