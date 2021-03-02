package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    override fun onStart() {
        super.onStart()
        initListeners()
    }
    private fun initListeners() {
        val buttonSend = findViewById<View>(R.id.random_button4)
        val sendIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
        }
        buttonSend.setOnClickListener {
            startActivity(Intent(Intent.createChooser(sendIntent, null)))
        }
    }

    fun hello(view: View) {
        val myToast = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun count(view: View) {
        textView = findViewById(R.id.textView2)
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        count++
        textView.text = count.toString()

    }

    fun goto2(view: View) {
        val randomIntent = Intent(this, MainActivity2::class.java)
        startActivity(randomIntent)
    }

    fun goto3(view: View) {
        val randomIntent = Intent(this, MainActivity3::class.java)
        startActivity(randomIntent)
    }

}