package com.example.sqldemo

import androidx.room3.ColumnInfo
import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "email")
data class Email(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "subject") val subject: String,
    @ColumnInfo(name = "sender") val sender: String,
    @ColumnInfo(name = "folder") val folder: String,
    @ColumnInfo(name = "starred") val starred: Boolean,
    @ColumnInfo(name = "read") val read: Boolean,
    @ColumnInfo(name = "received") val received: Int
)