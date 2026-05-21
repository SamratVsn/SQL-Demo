package com.example.sqldemo

import androidx.room3.Dao
import androidx.room3.Query

@Dao
interface EmailDao {
    @Query("SELECT * FROM email")
    suspend fun getAll(): List<Email>
}