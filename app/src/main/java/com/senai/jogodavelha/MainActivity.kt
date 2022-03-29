package com.senai.jogodavelha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jogarContraAmigo = findViewById<Button>(R.id.contraAmigo)
        val jogarContraRobo = findViewById<Button>(R.id.contraRobo)

        jogarContraAmigo.setOnClickListener(){
            val intent = Intent(this, JogoActivity::class.java)

            startActivity(intent)
        }

    }
}