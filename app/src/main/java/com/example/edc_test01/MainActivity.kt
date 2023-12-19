package com.example.edc_test01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.edc_test01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

//        binding?.image1?.setOnClickListener {
//                val intent = Intent(this,events::class.java)
//                startActivity(intent)
//        }
//        binding?.image2?.setOnClickListener {
//            val intent = Intent(this,events2::class.java)
//            startActivity(intent)
//        }
//        binding?.likedBtn?.setOnClickListener {
//            val intent = Intent(this,user_liked::class.java)
//            startActivity(intent)
//        }

        binding?.rvItemsList?.layoutManager = LinearLayoutManager(this)
        // Adapter class is initialized and list is passed in the param.
        val itemAdapter = ItemAdapter(getItemsList())
        // adapter instance is set to the recyclerview to inflate the items.
        binding?.rvItemsList?.adapter = itemAdapter



    }
    private fun getItemsList(): ArrayList<String> {
        val list = ArrayList<String>()

        list.add("Item One")
        list.add("Item Two")
        list.add("Item Three")
        list.add("Item Four")
        list.add("Item Five")
        list.add("Item Six")
        list.add("Item Seven")
        list.add("Item Eight")
        list.add("Item Nine")
        list.add("Item Ten")
        list.add("Item Eleven")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")
        list.add("Item Twelve")


        return list
    }
    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
//    fun setpage()
}