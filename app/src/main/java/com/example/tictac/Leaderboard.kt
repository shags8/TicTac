package com.example.tictac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Leaderboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)
        var winners = arrayOf<String>(5.toString())
    }
}