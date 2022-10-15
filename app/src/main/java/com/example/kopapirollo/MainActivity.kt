package com.example.kopapirollo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var rlayout : RelativeLayout
    private lateinit var mainlinear : LinearLayout
    private lateinit var playerImg : ImageView
    private lateinit var playerPick : TextView
    private lateinit var compImg : ImageView
    private lateinit var compPick: TextView
    private lateinit var result : TextView
    private lateinit var secondLinear : LinearLayout
    private lateinit var btnRock : Button
    private lateinit var btnPaper : Button
    private lateinit var btnScissors : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    fun init(){
        rlayout = findViewById(R.id.rlayout)
        mainlinear = findViewById(R.id.mainlinear)
        playerImg = findViewById(R.id.playerImg)
        playerPick = findViewById(R.id.playerPick)
        compImg = findViewById(R.id.compImg)
        compPick = findViewById(R.id.compPick)
        result = findViewById(R.id.result)
        secondLinear = findViewById(R.id.secondlinear)
        btnRock = findViewById(R.id.btnRock)
        btnPaper = findViewById(R.id.btnPaper)
        btnScissors = findViewById(R.id.btnScissors)
    }
}