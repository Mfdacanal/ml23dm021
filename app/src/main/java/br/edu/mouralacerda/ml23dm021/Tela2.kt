package br.edu.mouralacerda.ml23dm021

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView

class Tela2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val nome = intent.extras!!.getString("nome")!!
        val fone = intent.extras!!.getString("fone")!!
        val email = findViewById<EditText>(R.id.edtEmail)
        val botaosalvo = findViewById<ImageView>(R.id.btnSalvar)
        val botaovolta = findViewById<ImageView>(R.id.btnVoltar)
        val perfil = findViewById<TextView>(R.id.txtPerfil)
        val switch1 = findViewById<Switch>(R.id.switch1)

        switch1.setOnCheckedChangeListener {
                Switch, isChecked -> isChecked
            var PublicoOuPrivado = ""
            if (isChecked) {
                PublicoOuPrivado = "Privado"
            }else{
                PublicoOuPrivado = "Público"
            }
            switch1.text = PublicoOuPrivado
        }

        botaosalvo.setOnClickListener {
            val pacote = Bundle()

            pacote.putString("nome", nome)
            pacote.putString("fone", fone)
            pacote.putString("email", email.text.toString())
            pacote.putString("switch1", switch1.text.toString())

            val i = Intent(this, Tela3::class.java)
            i.putExtras(pacote)

            startActivity(i)

        }

        botaovolta.setOnClickListener {
            finish()
        }

    }
}