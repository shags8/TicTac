package com.example.tictac

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.RowId

@Entity(tableName="scoreboard")
data class Scoreboard(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name="Winner") val winner: String?,
)
