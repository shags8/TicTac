package com.example.tictac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val start = findViewById<Button>(R.id.start)
        start.setOnClickListener{
            val intent = Intent(this,PLAYER_names::class.java)
            startActivity(intent)
        }
       // val result = findViewById<Button>(R.id.result)
       // result.setOnClickListener{
         //   val intent = Intent(this,Leaderboard::class.java)
           // startActivity(intent)
       // }

    }
}