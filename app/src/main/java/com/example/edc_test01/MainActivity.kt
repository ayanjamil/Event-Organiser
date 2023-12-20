package com.example.edc_test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.edc_test01.R.drawable
import com.example.edc_test01.R.drawable.image01
import com.example.edc_test01.R.drawable.image04
import com.example.edc_test01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var eventsList:ArrayList<event_model>
    private lateinit var eventAdapter:EventAdapter
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.rvEventList?.layoutManager = LinearLayoutManager(this)
        eventsList= ArrayList()
        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image01,
            "makers and bakers",
            "Mesra at 1:00 P.M"
            ))
        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image02,
            "Baby cries Baby Dies",
            "Mesra at 1:00 P.M"
        ))
        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image03,
            "One or Nun",
            "Mesra at 1:00 P.M"
        ))
        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image04,
            "Try harder or go Bananas",
            "Mesra at 1:00 P.M"
        ))
        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image05,
            "Lick or stick it",
            "Mesra at 1:00 P.M"
        ))
        // Adapter class is initialized and list is passed in the param.
        val itemAdapter = EventAdapter(eventsList)
        // adapter instance is set to the recyclerview to inflate the items.
        binding?.rvEventList?.adapter = itemAdapter
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}