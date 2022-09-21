package com.example.tictac

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "winners_list")
data class Winners(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "playernames") val Pn: String
)


