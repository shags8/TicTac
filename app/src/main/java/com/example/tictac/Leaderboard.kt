package com.example.tictac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Leaderboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)
        val intent = intent
        val v6 = intent.getStringExtra("winner")
        var winners = arrayOfNulls<String>(5)
        var v1 = findViewById<TextView>(R.id.first)
        v1.text = "1"
        var v2 = findViewById<TextView>(R.id.second)
        v2.text = "2"
        var v3 = findViewById<TextView>(R.id.third)
        v3.text = "3"
        var v4 = findViewById<TextView>(R.id.fourth)
        v4.text = "4"
        var v5 = findViewById<TextView>(R.id.fifth)
        v5.text = "5"

    }
}