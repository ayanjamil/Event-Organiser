package com.example.edc_test01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.edc_test01.databinding.ActivityHistorySelectedBinding
import kotlinx.coroutines.launch

class history_selected : AppCompatActivity() {
    private var binding: ActivityHistorySelectedBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistorySelectedBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val dao = (application as DemoApp).db.eventDao() // initializing the dao
        getAllCompletedDates(dao)
    }
    private fun getAllCompletedDates(eventDao: eventDao) {
        lifecycleScope.launch {
            eventDao.fetchALlDates().collect { allCompletedDatesList->
                if (allCompletedDatesList.isNotEmpty()) {
                    // if there is any data in db then only initialize the recyclerview and put all the data of DB in recyclerview
                    binding?.rvhistory?.layoutManager = LinearLayoutManager(this@history_selected)
                    val events = ArrayList<String>()
                    for (event in allCompletedDatesList){
                        events.add(event.eventName)
                        // initiating a loop which adds all data of dp in recylerview
                    }
                    val historyAdapter = historyAdapter(ArrayList(events))// array list ie ids
                    binding?.rvhistory?.adapter = historyAdapter
                }
                else {
                    Log.d("history_empty","History empty")
                }
            }
        }

    }
}