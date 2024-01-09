package com.example.edc_test01

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class eventEntity (
    @PrimaryKey
    val eventName :String

)