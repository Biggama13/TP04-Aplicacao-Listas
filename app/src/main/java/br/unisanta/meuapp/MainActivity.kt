package br.unisanta.meuapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtLivro = findViewById<EditText>(R.id.edt_livro)
        val edtAutor = findViewById<EditText>(R.id.edt_autor)
        val btnEnviar = findViewById<Button>(R.id.btn_Enviar)

        btnEnviar.setOnClickListener {

            val nomeLivro = edtLivro.text.toString()
            val autor = edtAutor.text.toString()

            if (nomeLivro.isEmpty() || autor.isEmpty()) {

                Toast.makeText(
                    this,
                    "Preencha o nome do livro e o autor",
                    Toast.LENGTH_SHORT
                ).show()

            } else {

                val intent = Intent(this, UsuarioAcitivity::class.java)

                intent.putExtra("NOME_LIVRO", nomeLivro)
                intent.putExtra("AUTOR", autor)

                startActivity(intent)
            }
        }
    }
}