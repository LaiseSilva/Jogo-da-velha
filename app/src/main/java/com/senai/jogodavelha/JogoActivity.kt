package com.senai.jogodavelha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.widget.Button
import java.util.ArrayList

private  var jogador1 = true
private  var jogador2 = false
private  var vez = false
private  var botoesLista = ArrayList<Button>()

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

        botoesLista = arrayListOf<Button>(quadradinho1,quadradinho2,quadradinho3,quadradinho4,quadradinho5,quadradinho6,quadradinho7,quadradinho8,quadradinho9)

        for (x in 0..botoesLista.size-1)
        {
            botoesLista[x].setOnClickListener{
                jogar(it as Button)
            }
        }
    }

    private fun verificar ():Boolean {


        if (botoesLista[0].text != "" && botoesLista[1].text != ""  && botoesLista[2].text != ""
            && botoesLista[0].text == botoesLista[1].text && botoesLista[0].text == botoesLista[2].text)
            {
                val teste = findViewById<Button>(R.id.teste)
                teste.text ="ganhou?"

            }
        return true
    }

    /*Função que define as jogadas*/
    private fun jogar(quadradinho: Button ) {
        if(jogador1){
            quadradinho.text = jogadas()
        }else{
            quadradinho.text = jogadas()
        }

        quadradinho.setEnabled(false)
    }

    /* função que define quem joga*/
    private fun jogadas(): String {
        var simbolozinho =  ""

        if(vez == jogador1){
            simbolozinho = "X"
            vez = false
            verificar()

        }else if(vez == jogador2){

            simbolozinho = "O"
            vez = true
            verificar()

        }

        return simbolozinho
    }

    private fun fimDeJogo()
    {
        for (x in 0..botoesLista.size-1)
        {
            botoesLista[x].setEnabled(false)
        }
    }
}