package br.edu.mouralacerda.ml23dm021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Tela3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val nome = intent.extras!!.getString("nome")!!
        val fone = intent.extras!!.getString("fone")!!
        val email = intent.extras!!.getString("email")!!
        val switch1 = intent.extras!!.getString("switch1")!!

        val botaoVoltar1 = findViewById<ImageView>(R.id.btnVoltar1)

        findViewById<TextView>(R.id.txtNome).text = nome
        findViewById<TextView>(R.id.txtFone).text = fone
        findViewById<TextView>(R.id.txtEmail).text = email
        findViewById<TextView>(R.id.txtPerfil1).text = switch1

        botaoVoltar1.setOnClickListener {
            finish()
        }

    }
}