package com.example.tictac

import android.bluetooth.BluetoothA2dp
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = intent
        val player1 = intent.getStringExtra("player1")
        val player2 = intent.getStringExtra("player2")

       val home = findViewById<Button>(R.id.home)
       home.setOnClickListener{
           val intent2 = Intent(this,MainActivity2::class.java)
           startActivity(intent2)
        }
    }
    var chance=1
    var count=0

    fun game(view: View)
    {
        val player1 = intent.getStringExtra("player1")
        val player2 = intent.getStringExtra("player2")
        val playername1 = findViewById<TextView>(R.id.textView5)
        val playername2 = findViewById<TextView>(R.id.textView6)
        playername1.text=player1
        playername2.text=player2
        val buttonClicked = view as Button
        val buttonText = buttonClicked.text.toString()
             if (buttonText=="")
             {
                  if (chance == 1)
                  {
                       buttonClicked.text = "X"
                       chance = 0
                       count++
                  }
                  else
                  {
                       buttonClicked.text = "O"
                       chance = 1
                       count++
                  }
             }
             else
             {
                 Toast.makeText(this, "CHOOSE ANOTHER BLOCK ", Toast.LENGTH_SHORT).show()
             }
        val b1=findViewById<Button>(R.id.button1).text.toString()
        val b2=findViewById<Button>(R.id.button2).text.toString()
        val b3=findViewById<Button>(R.id.button3).text.toString()
        val b4=findViewById<Button>(R.id.button4).text.toString()
        val b5=findViewById<Button>(R.id.button5).text.toString()
        val b6=findViewById<Button>(R.id.button6).text.toString()
        val b7=findViewById<Button>(R.id.button7).text.toString()
        val b8=findViewById<Button>(R.id.button8).text.toString()
        val b9=findViewById<Button>(R.id.button9).text.toString()
             if(b1==b2&&b2==b3&&b3!="")
             {
                 if (b1=="X"){
                     Toast.makeText(this, "Winner is $player1 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }else{
                     Toast.makeText(this, "Winner is $player2 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }
             }
             else if (b4==b5&&b5==b6&&b6!="")
             {
                 if (b4=="X"){
                     Toast.makeText(this, "Winner is $player1 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }else{
                     Toast.makeText(this, "Winner is $player2 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }
             }
             else if (b7==b8&&b8==b9&&b9!="")
             {
                 if (b7=="X"){
                     Toast.makeText(this, "Winner is $player1 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }else{
                     Toast.makeText(this, "Winner is $player2 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }
             }
             else if (b1==b4&&b4==b7&&b7!="")
             {
                 if (b1=="X"){
                     Toast.makeText(this, "Winner is $player1 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }else{
                     Toast.makeText(this, "Winner is $player2 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }
             }
             else if (b2==b5&&b5==b8&&b8!="")
             {
                 if (b2=="X"){
                     Toast.makeText(this, "Winner is $player1 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }else{
                     Toast.makeText(this, "Winner is $player2 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }
             }
             else if (b3==b6&&b6==b9&&b9!="")
             {
                 if (b3=="X"){
                     Toast.makeText(this, "Winner is $player1 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }else{
                     Toast.makeText(this, "Winner is $player2 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }
             }
             else if (b1==b5&&b5==b9&&b9!="")
             {
                 if (b1=="X"){
                     Toast.makeText(this, "Winner is $player1 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }else{
                     Toast.makeText(this, "Winner is $player2 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }
             }
             else if (b3==b5&&b5==b7&&b7!="")
             {
                 if (b3=="X"){
                     Toast.makeText(this, "Winner is $player1 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }else{
                     Toast.makeText(this, "Winner is $player2 ", Toast.LENGTH_LONG).show()
                     newGame()
                 }
             }
             else
             {
                 if (count==9)
                 {
                     Toast.makeText(this, "IT IS A DRAW", Toast.LENGTH_LONG).show()
                     newGame()

                 }
             }

    }
    fun newGame()
    {
        val b1=findViewById<Button>(R.id.button1).setText("")
        val b2=findViewById<Button>(R.id.button2).setText("")
        val b3=findViewById<Button>(R.id.button3).setText("")
        val b4=findViewById<Button>(R.id.button4).setText("")
        val b5=findViewById<Button>(R.id.button5).setText("")
        val b6=findViewById<Button>(R.id.button6).setText("")
        val b7=findViewById<Button>(R.id.button7).setText("")
        val b8=findViewById<Button>(R.id.button8).setText("")
        val b9=findViewById<Button>(R.id.button9).setText("")
        chance=1
        count=0
    }

    fun restart(view: View)
    {
        val b1=findViewById<Button>(R.id.button1).setText("")
        val b2=findViewById<Button>(R.id.button2).setText("")
        val b3=findViewById<Button>(R.id.button3).setText("")
        val b4=findViewById<Button>(R.id.button4).setText("")
        val b5=findViewById<Button>(R.id.button5).setText("")
        val b6=findViewById<Button>(R.id.button6).setText("")
        val b7=findViewById<Button>(R.id.button7).setText("")
        val b8=findViewById<Button>(R.id.button8).setText("")
        val b9=findViewById<Button>(R.id.button9).setText("")
        chance=1
        count=0
    }



}
