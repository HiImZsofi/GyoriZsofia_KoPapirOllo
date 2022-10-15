package com.example.kopapirollo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.jar.Pack200

class MainActivity : AppCompatActivity() {

    private lateinit var mainlayout : LinearLayout //ok
    private lateinit var mainlinear : LinearLayout //ok
    private lateinit var cheart1 : ImageView
    private lateinit var cheart2 : ImageView
    private lateinit var cheart3 : ImageView
    private lateinit var pheart1 : ImageView
    private lateinit var pheart2 : ImageView
    private lateinit var pheart3 : ImageView
    private lateinit var draw : TextView
    private lateinit var playerPick : TextView
    private lateinit var compPick: TextView
    private lateinit var btnRock : Button
    private lateinit var btnPaper : Button
    private lateinit var btnScissors : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

    }

    fun init(){
        mainlayout = findViewById(R.id.mainlayout)
        mainlinear = findViewById(R.id.mainlinear)
        cheart1 = findViewById(R.id.cheart1)
        cheart2 = findViewById(R.id.cheart2)
        cheart3 = findViewById(R.id.cheart3)
        pheart1 = findViewById(R.id.pheart1)
        pheart2 = findViewById(R.id.pheart2)
        pheart3 = findViewById(R.id.pheart3)
        draw = findViewById(R.id.draw)
        playerPick = findViewById(R.id.playerPick)
        compPick = findViewById(R.id.compPick)
        btnRock = findViewById(R.id.btnRock)
        btnPaper = findViewById(R.id.btnPaper)
        btnScissors = findViewById(R.id.btnScissors)
    }
}