package br.unisanta.meuapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class UsuarioAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usuario_acitivity)

        val txvNomeLivro = findViewById<TextView>(R.id.txv_Nome_livro)
        val txvNomeAutor = findViewById<TextView>(R.id.txv_Nome_autor)
        val fabVolta = findViewById<FloatingActionButton>(R.id.fab_volta)

        val nomeLivro = intent.getStringExtra("NOME_LIVRO")
        val autor = intent.getStringExtra("AUTOR")

        txvNomeLivro.text = nomeLivro
        txvNomeAutor.text = autor

        fabVolta.setOnClickListener {
            finish()
        }
    }
}