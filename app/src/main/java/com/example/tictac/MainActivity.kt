package com.example.tictac

import android.bluetooth.BluetoothA2dp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var chance=1
    var count1=0
    var count2=0

    fun game(view: View)
    {
        val buttonClicked = view as Button
        val buttonText = buttonClicked.getText().toString()
             if (buttonText=="")
             {
                  if (chance == 1)
                  {
                       buttonClicked.text = "X"
                       chance = 0
                       count1++
                  }
                  else
                  {
                       buttonClicked.text = "O"
                       chance = 1
                       count2++
                  }
             }
             else
             {
                 Toast.makeText(this, "CHOOSE ANOTHER BLOCK ", Toast.LENGTH_SHORT).show()
             }
        var b1=findViewById<Button>(R.id.button1).text.toString()
        var b2=findViewById<Button>(R.id.button2).text.toString()
        var b3=findViewById<Button>(R.id.button3).text.toString()
        var b4=findViewById<Button>(R.id.button4).text.toString()
        var b5=findViewById<Button>(R.id.button5).text.toString()
        var b6=findViewById<Button>(R.id.button6).text.toString()
        var b7=findViewById<Button>(R.id.button7).text.toString()
        var b8=findViewById<Button>(R.id.button8).text.toString()
        var b9=findViewById<Button>(R.id.button9).text.toString()
             if(b1==b2&&b2==b3&&b3!="")
             {
                 Toast.makeText(this, "Winner is $b1 ", Toast.LENGTH_LONG).show()

             }
             else if (b4==b5&&b5==b6&&b6!="")
             {
                 Toast.makeText(this, "Winner is $b4", Toast.LENGTH_LONG).show()
             }
             else if (b7==b8&&b8==b9&&b9!="")
             {
                 Toast.makeText(this, "Winner is $b7", Toast.LENGTH_LONG).show()
             }
             else if (b1==b4&&b4==b7&&b7!="")
             {
                 Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
             }
             else if (b2==b5&&b5==b8&&b8!="")
             {
                 Toast.makeText(this, "Winner is $b2", Toast.LENGTH_LONG).show()
             }
             else if (b3==b6&&b6==b9&&b9!="")
             {
                 Toast.makeText(this, "Winner is $b3", Toast.LENGTH_LONG).show()
             }
             else if (b1==b5&&b5==b9&&b9!="")
             {
                 Toast.makeText(this, "Winner is $b1", Toast.LENGTH_LONG).show()
             }
             else if (b3==b5&&b5==b7&&b7!="")
             {
                 Toast.makeText(this, "Winner is $b3", Toast.LENGTH_LONG).show()
             }
             else
             {
                 if (count1+count2==9)
                 {
                     Toast.makeText(this, "IT IS A DRAW", Toast.LENGTH_LONG).show()
                 }
             }

    }
}