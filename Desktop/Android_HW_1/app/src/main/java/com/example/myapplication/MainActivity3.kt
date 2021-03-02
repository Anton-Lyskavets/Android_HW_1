package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }
    fun toActivity1(view: View) {
        val randomIntent = Intent(this, MainActivity::class.java)
        startActivity(randomIntent)
    }

    fun toActivity2(view: View) {
        val randomIntent = Intent(this, MainActivity2::class.java)
        startActivity(randomIntent)
    }
}