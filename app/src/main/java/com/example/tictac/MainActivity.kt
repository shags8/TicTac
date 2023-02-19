package com.example.tictac

import android.annotation.SuppressLint
import android.app.Dialog
import android.app.ProgressDialog.show
import android.bluetooth.BluetoothA2dp
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.System.exit
import android.widget.ImageView as ImageView1

class MainActivity : AppCompatActivity() {
    var filledpos = intArrayOf(-1,-1,-1,-1,-1,-1,-1,-1,-1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = intent
        val player1 = intent.getStringExtra("player1")
        val player2 = intent.getStringExtra("player2")
        val playername1 = findViewById<TextView>(R.id.textView5)
        val playername2 = findViewById<TextView>(R.id.textView6)
        playername1.text = intent.getStringExtra("player1")
        playername2.text = intent.getStringExtra("player2")
        var currentplayer = findViewById<TextView>(R.id.textView7)
        val b1 = findViewById<Button>(R.id.button1)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)
        val b4 = findViewById<Button>(R.id.button4)
        val b5 = findViewById<Button>(R.id.button5)
        val b6 = findViewById<Button>(R.id.button6)
        val b7 = findViewById<Button>(R.id.button7)
        val b8 = findViewById<Button>(R.id.button8)
        val b9 = findViewById<Button>(R.id.button9)
        currentplayer.text = player1 +"'s TURN"
        val home = findViewById<Button>(R.id.home)
        home.setOnClickListener {
            val intent2 = Intent(this, MainActivity2::class.java)
            intent2.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK.or(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent2)
            finish()
        }
    }

    var chance = 1
    var count = 0
    @SuppressLint("SuspiciousIndentation")
    fun game(view: View) {
        var count = 0
        val player1 = intent.getStringExtra("player1")
        val player2 = intent.getStringExtra("player2")
        var currentplayer = findViewById<TextView>(R.id.textView7)
        val buttonClicked = view as Button
        val buttonTag = buttonClicked.tag.toString().toInt()

             if (filledpos[buttonTag]==-1)
             {
                  if (chance == 1)
                  {
                       buttonClicked.text = "X"
                       buttonClicked.backgroundTintList = getColorStateList(R.color.cross)
                       currentplayer.text ="$player2's TURN"
                       filledpos[buttonTag]=0
                       chance = 0
                       count++
                  }
                  else
                  {
                       buttonClicked.text = "O"
                       buttonClicked.backgroundTintList = getColorStateList(R.color.zero)
                       currentplayer.text ="$player1's TURN"
                       filledpos[buttonTag]=1
                       chance = 1
                       count++
                  }
             }
             else
             {
                 Toast.makeText(this, "CHOOSE ANOTHER BLOCK ", Toast.LENGTH_SHORT).show()
             }
        var winpos = arrayOf(intArrayOf(0,1,2),intArrayOf(3,4,5),intArrayOf(6,7,8),intArrayOf(0,3,6),intArrayOf(1,4,7),
            intArrayOf(2,5,8),intArrayOf(0,4,8),intArrayOf(2,4,6))

        for(i in winpos.indices)
        {
            var block1 = winpos[i][0]
            var block2 = winpos[i][1]
            var block3 = winpos[i][2]
            if (filledpos[block1]==filledpos[block2]&&filledpos[block2]==filledpos[block3])
            {
                if (filledpos[block1]!=-1){
                    if (filledpos[block1]==0){
                    AlertDialog.Builder(this).setMessage("$player1 IS WINNER").setTitle("TIC TAC TOE")
                        .setNegativeButton("EXIT",DialogInterface.OnClickListener{dialogInterface, i -> exit()})
                        .setPositiveButton("RESTART", DialogInterface.OnClickListener{dialogInterface, i -> newGame() })
                        .show()
                    }
                    else{
                        AlertDialog.Builder(this).setMessage("$player2 IS WINNER").setTitle("TIC TAC TOE")
                            .setNegativeButton("EXIT",DialogInterface.OnClickListener{dialogInterface, i -> exit() })
                            .setPositiveButton("RESTART", DialogInterface.OnClickListener{dialogInterface, i -> newGame() })
                            .show()
                    }

                }
            }
        }
        if (count==9)
        {
            AlertDialog.Builder(this).setMessage("IT IS A DRAW").setTitle("TIC TAC TOE")
                .setNegativeButton("EXIT",DialogInterface.OnClickListener{dialogInterface, i -> exit()})
                .setPositiveButton("RESTART", DialogInterface.OnClickListener{dialogInterface, i -> newGame() })
                .show()
        }

    }


    fun newGame()
    {
        val b1 = findViewById<Button>(R.id.button1)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)
        val b4 = findViewById<Button>(R.id.button4)
        val b5 = findViewById<Button>(R.id.button5)
        val b6 = findViewById<Button>(R.id.button6)
        val b7 = findViewById<Button>(R.id.button7)
        val b8 = findViewById<Button>(R.id.button8)
        val b9 = findViewById<Button>(R.id.button9)
        b1.backgroundTintList = getColorStateList(R.color.lightblue2)
        b2.backgroundTintList = getColorStateList(R.color.lightblue2)
        b3.backgroundTintList = getColorStateList(R.color.lightblue2)
        b4.backgroundTintList = getColorStateList(R.color.lightblue2)
        b5.backgroundTintList = getColorStateList(R.color.lightblue2)
        b6.backgroundTintList = getColorStateList(R.color.lightblue2)
        b7.backgroundTintList = getColorStateList(R.color.lightblue2)
        b8.backgroundTintList = getColorStateList(R.color.lightblue2)
        b9.backgroundTintList = getColorStateList(R.color.lightblue2)
        b1.text=""
        b2.text=""
        b3.text=""
        b4.text=""
        b5.text=""
        b6.text=""
        b7.text=""
        b8.text=""
        b9.text=""

        filledpos = intArrayOf(-1,-1,-1,-1,-1,-1,-1,-1,-1)
        chance=1
        count=0
        var currentplayer = findViewById<TextView>(R.id.textView7).setText("PLAYER-1 TURN")
    }

    fun restart(view: View)
    {
        val b1 = findViewById<Button>(R.id.button1)
        val b2 = findViewById<Button>(R.id.button2)
        val b3 = findViewById<Button>(R.id.button3)
        val b4 = findViewById<Button>(R.id.button4)
        val b5 = findViewById<Button>(R.id.button5)
        val b6 = findViewById<Button>(R.id.button6)
        val b7 = findViewById<Button>(R.id.button7)
        val b8 = findViewById<Button>(R.id.button8)
        val b9 = findViewById<Button>(R.id.button9)
        b1.backgroundTintList = getColorStateList(R.color.lightblue2)
        b2.backgroundTintList = getColorStateList(R.color.lightblue2)
        b3.backgroundTintList = getColorStateList(R.color.lightblue2)
        b4.backgroundTintList = getColorStateList(R.color.lightblue2)
        b5.backgroundTintList = getColorStateList(R.color.lightblue2)
        b6.backgroundTintList = getColorStateList(R.color.lightblue2)
        b7.backgroundTintList = getColorStateList(R.color.lightblue2)
        b8.backgroundTintList = getColorStateList(R.color.lightblue2)
        b9.backgroundTintList = getColorStateList(R.color.lightblue2)

        b1.text=""
        b2.text=""
        b3.text=""
        b4.text=""
        b5.text=""
        b6.text=""
        b7.text=""
        b8.text=""
        b9.text=""

        filledpos = intArrayOf(-1,-1,-1,-1,-1,-1,-1,-1,-1)
        chance=1
        count=0
        var currentplayer = findViewById<TextView>(R.id.textView7).setText("PLAYER-1 TURN")
    }
    fun exit()
    {
        val intent2 = Intent(this, MainActivity2::class.java)
        startActivity(intent2)
    }
}




