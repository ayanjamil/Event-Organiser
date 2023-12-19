package com.example.edc_test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.edc_test01.databinding.ActivityMainBinding
import com.example.edc_test01.databinding.ActivityUserLikedBinding

class user_liked : AppCompatActivity() {
    private var binding: ActivityUserLikedBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserLikedBinding.inflate(layoutInflater)
        setContentView(binding?.root)

    }
}