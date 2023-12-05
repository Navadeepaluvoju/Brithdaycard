package com.example.brithdaycard

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Birthday : AppCompatActivity() {
    companion object{
        const val NAME = "name"
    }

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)
        val birthdayg = findViewById<TextView>(R.id.birthday)

       val name = intent.getStringExtra(NAME)
     birthdayg.text = "Happy Birthday $name !!"
    }
}