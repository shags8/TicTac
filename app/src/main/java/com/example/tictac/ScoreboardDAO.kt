package com.example.tictac

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface ScoreboardDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(scoreboard: Scoreboard)

    @Delete
    suspend fun delete(scoreboard: Scoreboard)
}