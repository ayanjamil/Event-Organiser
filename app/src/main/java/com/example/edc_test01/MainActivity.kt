package com.example.edc_test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
    //intitializing variables to be used
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
            "Mesra" ,"00:13:12:02:24", getString(R.string.randomDescriptions)
            ))

        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image02,
            "Baby cries Baby Dies",
            "Mesra" ,"00:13:12:02:24", getString(R.string.randomDescriptions)
        ))
        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image03,
            "One or Nun",
            "Mesra" ,"00:13:12:02:24", getString(R.string.randomDescriptions)
        ))
        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image04,
            "Try harder or go Bananas",
            "Mesra" ,"00:13:12:02:24", getString(R.string.randomDescriptions)
        ))
        eventsList.add(event_model(
            com.example.edc_test01.R.drawable.image05,
            "Lick or stick it",
            "Mesra" ,"00:13:12:02:24", getString(R.string.randomDescriptions)
        ))

       //repeating
        //can also make a constance for making this block cleaner



        // Adapter class is initialized above and list is passed in the param.
        eventAdapter = EventAdapter(eventsList)
        // adapter instance is set to the recyclerview to inflate the items.
        binding?.rvEventList?.adapter = eventAdapter
        // and here the adapter setting ends
        eventAdapter.onItemClick={
            val intent = Intent(this,event_detail::class.java)
            intent.putExtra("event",it)
            startActivity(intent)
            Log.d("click","click in the main is getting registerd")
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}