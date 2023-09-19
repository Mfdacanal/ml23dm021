package br.edu.mouralacerda.ml23dm021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaofechar = findViewById<ImageView>(R.id.btnFechar)
        val botaoavancar = findViewById<ImageView>(R.id.btnAvancar)
        val nome = findViewById<EditText>(R.id.edtNome)
        val fone = findViewById<EditText>(R.id.edtFone)

        botaoavancar.setOnClickListener() {

            val pacote = Bundle()
            pacote.putString("nome", nome.text.toString())
            pacote.putString("fone", fone.text.toString())

            val i = Intent(this, Tela2::class.java)

            i.putExtras(pacote)
            startActivity(i)

        }
        botaofechar.setOnClickListener {
            finish()
        }


    }
}