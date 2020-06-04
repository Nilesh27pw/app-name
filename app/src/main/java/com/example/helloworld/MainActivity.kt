package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
 lateinit var diceimage:ImageView
    lateinit var diceimage2:ImageView

    var randomn1 = 0
    var randomn2 =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceimage = findViewById(R.id.imageView)
        diceimage2 = findViewById(R.id.imageView2)

        //val rollButton: Button = findViewById(R.id.roll_button)
       // var randomn: Int = (1..6).random()

        button.setOnClickListener {
           // randomn1 = (1..6).random()
            getRandomDiceImage()
            rolldice(randomn1,randomn2)
            //rolldice(randomn2)
        }
        button2.setOnClickListener {
            if(randomn1 == 0)
            {
                randomn1 = 1
                rolldice(randomn1,randomn2)
            }
            else if(randomn1 == 6)
            {
                rolldice(randomn1,randomn2)
            }
            else {
                    randomn1= randomn1+1
                 rolldice(randomn1, randomn2)
            }
            if(randomn2 == 0) {
                randomn2=1
                rolldice(randomn1, randomn2)
            }
            else if(randomn2 == 6)
            {
                rolldice(randomn1,randomn2)
            }
            else {
                randomn2=randomn2+1
                rolldice(randomn1, randomn2)
            }
        }
        button3.setOnClickListener {
            rolldice(0,0)
            randomn1 = 0
            randomn2=0
        }
    }
    private fun rolldice(randomn:Int,randomn2:Int) {
        //randomn = (1..6).random()
        //textView.text = randomn.toString()
         val drawableResource = when (randomn){
             1-> R.drawable.dice_1
             2-> R.drawable.dice_2
             3->R.drawable.dice_3
             4->R.drawable.dice_4
             5->R.drawable.dice_5
             6->R.drawable.dice_6
             else->R.drawable.empty_dice
         }

        val drawableResource2 = when (randomn2){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            6->R.drawable.dice_6
            else->R.drawable.empty_dice
        }
         diceimage.setImageResource(drawableResource)
        diceimage2.setImageResource(drawableResource2)
    }
    fun getRandomDiceImage()  {
        randomn1 = (1..6).random()
        randomn2 = (1..6).random()



    }

}

