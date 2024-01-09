package com.example.edc_test01

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface eventDao {
    @Insert
    suspend fun insert(eventEntity: eventEntity)

    @Query("Select * from eventEntity")
    fun fetchALlDates(): Flow<List<eventEntity>>
}