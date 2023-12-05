
package com.example.brithdaycard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var nameInput: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.createbutton)
        nameInput = findViewById(R.id.useer)




        button.setOnClickListener {
            val name = nameInput.editableText.toString()
            Toast.makeText(this, "Loading", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Birthday::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}

