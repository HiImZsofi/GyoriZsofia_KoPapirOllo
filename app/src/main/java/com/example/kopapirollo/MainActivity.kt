package com.example.kopapirollo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.jar.Pack200

class MainActivity : AppCompatActivity() {
    var rnd : Int = 0
    var draws : Int = 0
    var win : Int = 0
    var loss : Int = 0

    private lateinit var mainlayout : LinearLayout //ok
    private lateinit var mainlinear : LinearLayout //ok
    private lateinit var cheart1 : ImageView
    private lateinit var cheart2 : ImageView
    private lateinit var cheart3 : ImageView
    private lateinit var pheart1 : ImageView
    private lateinit var pheart2 : ImageView
    private lateinit var pheart3 : ImageView
    private lateinit var draw : TextView
    private lateinit var playerPick : ImageView
    private lateinit var compPick: ImageView
    private lateinit var btnRock : ImageButton
    private lateinit var btnPaper : ImageButton
    private lateinit var btnScissors : ImageButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
        //1 rock
        //2 paper
        //3 scissors

        btnRock.setOnClickListener{
            playerPick.setImageResource(R.drawable.rock)
            rnd = (1..3).random()
            if(rnd == 1){ //player rock comp rock
                draws++
                compPick.setImageResource(R.drawable.rock)
                draw.setText("Döntetlenek száma: $draws")
            }
            else if(rnd == 3){ //player rock comp scissors
                win++
                compPick.setImageResource(R.drawable.scissors)
                Toast.makeText(this@MainActivity, "Nyertél!", Toast.LENGTH_SHORT).show()
                if(win == 1){
                    cheart3.setImageResource(R.drawable.heart1)
                }
                else if(win == 2){
                    cheart2.setImageResource(R.drawable.heart1)
                }
                else if(win == 3){
                    cheart1.setImageResource(R.drawable.heart1)
                    gameOver()
                }
            }
            else if(rnd == 2){ //player rock comp paper
                loss++
                compPick.setImageResource(R.drawable.paper)
                Toast.makeText(this@MainActivity, "Veszítettél!", Toast.LENGTH_SHORT).show()
                if(loss == 1){
                    pheart1.setImageResource(R.drawable.heart1)
                }
                else if(loss == 2){
                    pheart2.setImageResource(R.drawable.heart1)
                }
                else if(loss == 3){
                    pheart3.setImageResource(R.drawable.heart1)
                    gameOver()
                }
            }
        }

        btnPaper.setOnClickListener{
            playerPick.setImageResource(R.drawable.paper)
            rnd = (1..3).random()
            if(rnd == 2){ //player paper comp paper
                draws++
                compPick.setImageResource(R.drawable.paper)
                draw.setText("Döntetlenek száma: $draws")
            }
            else if(rnd == 3){ //player paper comp scissors
                loss++
                compPick.setImageResource(R.drawable.scissors)
                Toast.makeText(this@MainActivity, "Veszítettél!", Toast.LENGTH_SHORT).show()
                if(win == 1){
                    pheart1.setImageResource(R.drawable.heart1)
                }
                else if(win == 2){
                    pheart2.setImageResource(R.drawable.heart1)
                }
                else if(win == 3){
                    pheart3.setImageResource(R.drawable.heart1)
                    gameOver()
                }
            }
            else if(rnd == 1){ //player paper comp rock
                win++
                compPick.setImageResource(R.drawable.rock)
                Toast.makeText(this@MainActivity, "Nyertél!", Toast.LENGTH_SHORT).show()
                if(loss == 1){
                    cheart3.setImageResource(R.drawable.heart1)
                }
                else if(loss == 2){
                    cheart2.setImageResource(R.drawable.heart1)
                }
                else if(loss == 3){
                    cheart1.setImageResource(R.drawable.heart1)
                    gameOver()
                }
            }
        }

        btnScissors.setOnClickListener{
            playerPick.setImageResource(R.drawable.scissors)
            rnd = (1..3).random()
            if(rnd == 3){ //player scissors comp scissors
                draws++
                compPick.setImageResource(R.drawable.scissors)
                draw.setText("Döntetlenek száma: $draws")
            }
            else if(rnd == 1){ //player scissors comp rock
                loss++
                compPick.setImageResource(R.drawable.rock)
                Toast.makeText(this@MainActivity, "Veszítettél!", Toast.LENGTH_SHORT).show()
                if(win == 1){
                    pheart1.setImageResource(R.drawable.heart1)
                }
                else if(win == 2){
                    pheart2.setImageResource(R.drawable.heart1)
                }
                else if(win == 3){
                    pheart3.setImageResource(R.drawable.heart1)
                    gameOver()
                }
            }
            else if(rnd == 1){ //player scissors comp paper
                win++
                compPick.setImageResource(R.drawable.paper)
                Toast.makeText(this@MainActivity, "Nyertél!", Toast.LENGTH_SHORT).show()
                if(loss == 1){
                    cheart3.setImageResource(R.drawable.heart1)
                }
                else if(loss == 2){
                    cheart2.setImageResource(R.drawable.heart1)
                }
                else if(loss == 3){
                    cheart1.setImageResource(R.drawable.heart1)
                    gameOver()
                }
            }
        }

    }

    fun gameOver(){

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