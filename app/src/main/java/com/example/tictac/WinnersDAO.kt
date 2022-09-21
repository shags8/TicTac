package com.example.tictac

import androidx.room.*


@Dao
interface WinnersDAO {
    @Query("SELECT * FROM winners_list")
    fun getAll(): List<Winners>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(winners: Winners)

    @Delete
    suspend fun delete(winners: Winners)


}