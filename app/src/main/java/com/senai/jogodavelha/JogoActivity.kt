package com.senai.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        val teste = findViewById<Button>(R.id.teste)


        quadradinho1.setOnClickListener( ){ jogar(quadradinho1) }

        quadradinho2.setOnClickListener(){jogar(quadradinho2)}

        quadradinho3.setOnClickListener(){jogar(quadradinho3)}

        quadradinho4.setOnClickListener(){jogar(quadradinho4)}

        quadradinho5.setOnClickListener(){jogar(quadradinho5)}

        quadradinho6.setOnClickListener(){jogar(quadradinho6)}

        quadradinho7.setOnClickListener(){jogar(quadradinho7)}

        quadradinho8.setOnClickListener(){jogar(quadradinho8)}

        quadradinho9.setOnClickListener(){jogar(quadradinho9)}

        if(quadradinho1.isEnabled == false && quadradinho1.text == "O"){
            teste.text = "sim"
        }else{

        }




    }

    private fun jogar(quadradinho: Button ) {
        if(jogador1){
            quadradinho.text = jogadas()
        }else{
            quadradinho.text = jogadas()
        }

        quadradinho.setEnabled(false)
    }

    private fun jogadas(): String {
        var simbolozinho =  ""

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