package com.senai.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

private  var jogador1 = true
private  var jogador2 = false
private  var vez = false

class JogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogo)

        val quadradinho1 = findViewById<Button>(R.id.quadrinho1)
        val quadradinho2 = findViewById<Button>(R.id.quadrinho2)
        val quadradinho3 = findViewById<Button>(R.id.quadrinho3)
        val quadradinho4 = findViewById<Button>(R.id.quadrinho4)
        val quadradinho5 = findViewById<Button>(R.id.quadrinho5)
        val quadradinho6 = findViewById<Button>(R.id.quadrinho6)
        val quadradinho7 = findViewById<Button>(R.id.quadrinho7)
        val quadradinho8 = findViewById<Button>(R.id.quadrinho8)
        val quadradinho9 = findViewById<Button>(R.id.quadrinho9)




        quadradinho1.setOnClickListener(){
            if(jogador1){
                quadradinho1.text = jogadas()
            }else{
                quadradinho1.text = jogadas()
            }

            quadradinho1.setEnabled(false)

        }

        quadradinho2.setOnClickListener(){

            if(jogador1){
                quadradinho2.text = jogadas()
            }else{
                quadradinho2.text = jogadas()
            }

            quadradinho2.setEnabled(false)

        }

        quadradinho3.setOnClickListener(){

            if(jogador1){
                quadradinho3.text = jogadas()
            }else{
                quadradinho3.text = jogadas()
            }

            quadradinho3.setEnabled(false)

        }

        quadradinho4.setOnClickListener(){

            if(jogador1){
                quadradinho4.text = jogadas()
            }else{
                quadradinho4.text = jogadas()
            }

            quadradinho4.setEnabled(false)

        }




    }

    private fun jogadas(): String {
        var simbolozinho =  "X"

        if(vez == jogador1){
            simbolozinho = "X"
            vez = false
        }else if(vez == jogador2){
            simbolozinho = "O"
            vez = true
        }
        return simbolozinho
    }
}