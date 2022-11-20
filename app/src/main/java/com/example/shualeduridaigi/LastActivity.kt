package com.example.shualeduridaigi

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LastActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last)
        supportActionBar?.hide()


        // Pixel_3a
        // Pixel_3a
        // Pixel_3a
        // Pixel_3a
        // Pixel_3a
        // Pixel_3a
        // Pixel_3a
        // Pixel_3a




        val resultWinner=intent.extras?.getString("winnerPlayer")
        val resultFirst=intent.extras?.getString("firstPlayer")
        val resultSecond=intent.extras?.getString("secondPlayer")
        val winningNum=intent.extras?.getInt("winningScore")
        var resultNum=intent.extras?.getInt("winnerNum")

        var btn1=findViewById<Button>(R.id.reMatch)
        var btn2=findViewById<Button>(R.id.newGame)
        var text=findViewById<TextView>(R.id.winnerText)

        if (resultNum==1) {
            text.setTextColor(Color.RED)
            text.text="Winner Is ${resultWinner}"
        }else if(resultNum==2){
            text.setTextColor(Color.GREEN)
            text.text="Winner Is ${resultWinner}"
        }


        btn1.setOnClickListener {
            var rematchNum=1
            val intent1= Intent(this,first::class.java).also {
                it.putExtra("firstPlayer", resultFirst)
                it.putExtra("secondPlayer", resultSecond)
                it.putExtra("rematch",rematchNum)
                it.putExtra("winningScore",winningNum)
            }
            startActivity(intent1)
        }

        btn2.setOnClickListener {
            val intent2= Intent(this,MainActivity::class.java)
            startActivity(intent2)
        }




    }
}