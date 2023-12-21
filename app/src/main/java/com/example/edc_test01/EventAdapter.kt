package com.example.edc_test01
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EventAdapter(private val eventList: ArrayList<event_model>) :
    RecyclerView.Adapter<EventAdapter.EventViewHolder>() {

    var onItemClick:((event_model)->Unit)?=null
    // defining lamda function of clickability of items inside recyclerview



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.event_layout,parent,false)
        return EventViewHolder(view)
        // nothing much to do here it is what it is this is how you do it without viewbinding
    }
    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val event = eventList[position]
        holder.heading.text = event.tv_heading
        holder.description.text = event.tv_descrpition
        holder.image.setImageResource(event.image)
        //assigning the positions of each event in the recyclerview
        // the recycler views text = event which is a variale decleared locally which holds
        // the values of a instance of eventList which is passed in the recyclerview

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(event)

        }
    }
    override fun getItemCount(): Int {
        return eventList.size
    }
    class EventViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.image)
        val heading:TextView =itemView.findViewById(R.id.headding_event01)
        val description:TextView =itemView.findViewById(R.id.tv_loctimedetails)
        //importing all the ids of the itemrow XML as that XML is an example of how each element
        // in the recyclerview should be




    }
    //can also use binding in the above block
}