package com.example.tictac

import android.bluetooth.BluetoothA2dp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var chance=1
    var count1=0
    var count2=0

    fun game(view: View) {
        val B1=findViewById<Button>(R.id.button1)
        val B2=findViewById<Button>(R.id.button2)
        val B3=findViewById<Button>(R.id.button3)
        val B4=findViewById<Button>(R.id.button4)
        val B5=findViewById<Button>(R.id.button5)
        val B6=findViewById<Button>(R.id.button6)
        val B7=findViewById<Button>(R.id.button7)
        val B8=findViewById<Button>(R.id.button8)
        val B9=findViewById<Button>(R.id.button9)
        val buttonClicked = view as Button
        if (chance==1)
        {
            buttonClicked.text="X"
            chance=0
        }
        else
        {
            buttonClicked.text="O"
            chance=1
        }
    }
}