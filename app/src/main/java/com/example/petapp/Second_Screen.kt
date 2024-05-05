package com.example.petapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Second_Screen : AppCompatActivity() {

    private var cleanliness = 10
    private var health = 10
    private var hunger = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        //Declare buttons
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val playButton = findViewById<Button>(R.id.playButton)
        val foodButton = findViewById<Button>(R.id.foodButton)
        val imageViewPet = findViewById<ImageView>(R.id.imageViewPet)


        //Declare textViews
        val textViewHunger = findViewById<TextView>(R.id.textViewHunger)
        val textViewHealth = findViewById<TextView>(R.id.textViewHealth)
        val textViewCleanliness = findViewById<TextView>(R.id.textViewCleanliness)

         fun updateUI() {

            //initialise textViews
            textViewCleanliness.text = "Cleanliness: $cleanliness"
            textViewHunger.text = "Hunger: $hunger"
            textViewHealth.text = "Health: $health"
        }
        //initialise foodButton
        foodButton.setOnClickListener {
            feedPet()
            updateUI()
            //change image of rabbit according to action of feeding
            imageViewPet.setImageResource(R.drawable.rabbit_food)

        }

        //initialise playButton
        playButton.setOnClickListener {
            playWithPet()
            updateUI()
            //change image to play with rabbit
            imageViewPet.setImageResource(R.drawable.rabbit_play)

        }

        //initialise cleanButton
        cleanButton.setOnClickListener {
            cleanPet()
            updateUI()
            //change image displaying bathing rabbit
            imageViewPet.setImageResource(R.drawable.rabbit_clean)

        }

    }

    //feedPet
    private fun feedPet() {
        hunger += 50
        health += 15
        if (hunger > 50) cleanliness -= 15
        if (hunger > 60) hunger += 35

    }

    //playWithPet
    private fun playWithPet() {
        health += 25
        hunger += 10
        cleanliness += 10
        if (cleanliness > 15) cleanliness -= 5
        if (cleanliness > 10) health += 25

    }

    //cleanPet
    private fun cleanPet() {
        health += 25
        cleanliness += 25
        hunger -= 5
        if (cleanliness < 50) cleanliness += 60

    }
}

