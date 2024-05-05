package com.example.petapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // Using a lateinit var variable to initialise later
    private lateinit var openButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialise OpenButton
        openButton = findViewById(R.id.openButton)

        // Using onClickListener to make the button clickable
        openButton.setOnClickListener {
            // Using Intent Function to navigate to the Second_Screen Activity
            val intent = Intent(this, Second_Screen::class.java)

            //Function to start activity
            startActivity(intent)
        }


        }
    }
