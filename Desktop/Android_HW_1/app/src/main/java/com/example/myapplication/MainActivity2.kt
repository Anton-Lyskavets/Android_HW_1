package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity2 : AppCompatActivity() {

    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        showRandomNumber()
    }

    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        val random = Random()
        var randomInt = 0

        if (count>0){
            randomInt = random.nextInt(count + 1)
        }
    }
    fun toActivity1(view: View) {
        val randomIntent = Intent(this, MainActivity::class.java)
        startActivity(randomIntent)
    }

    fun toActivity3(view: View) {
        val randomIntent = Intent(this, MainActivity3::class.java)
        startActivity(randomIntent)
    }
}