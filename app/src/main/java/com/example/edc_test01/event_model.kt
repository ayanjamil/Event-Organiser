package com.example.edc_test01

import android.os.Parcel
import android.os.Parcelable

//making a class for passing a specific type of data into the recyclerview which is
// haveing a ImageView and two TextViews

data class event_model
    (var image:Int,
     var tv_heading:String,
     var tv_descrpition:String): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(tv_heading)
        parcel.writeString(tv_descrpition)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<event_model> {
        override fun createFromParcel(parcel: Parcel): event_model {
            return event_model(parcel)
        }

        override fun newArray(size: Int): Array<event_model?> {
            return arrayOfNulls(size)
        }
    }
}
