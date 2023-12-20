package com.example.edc_test01

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.edc_test01.databinding.ItemsRowBinding

class EventAdapter(private val eventList: ArrayList<event_model>) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items_row,parent,false)
        return EventViewHolder(view)
    }
    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = eventList[position]
        holder.heading.text = event.tv_heading
        holder.description.text = event.tv_descrpition
        holder.image.setImageResource(event.image)

    }

    override fun getItemCount(): Int {
        return eventList.size
    }

    class EventViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.image)
        val heading:TextView =itemView.findViewById(R.id.headding_event01)
        val description:TextView =itemView.findViewById(R.id.tv_loctimedetails)

    }
}