package com.example.tictac

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class PLAYER_names : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_names) }

    fun play(view: View) {
        val player1 = findViewById<EditText>(R.id.editText).text.toString()
        val player2 = findViewById<EditText>(R.id.editText2).text.toString()
        if (player1==""||player2==""){
            Toast.makeText(this, "Names cannot be empty", Toast.LENGTH_LONG).show()
        }else{
            val intent3 = Intent(this,MainActivity::class.java)
            intent3.putExtra("player1",player1)
            intent3.putExtra("player2",player2)
            startActivity(intent3)
        }
    }
}