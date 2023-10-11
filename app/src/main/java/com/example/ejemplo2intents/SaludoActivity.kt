package com.example.ejemplo2intents

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SaludoActivity : AppCompatActivity() {

    // atributos
    private lateinit var tvSaludo : TextView
    private lateinit var btnVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        // inicializar atributos
        tvSaludo = findViewById(R.id.tvSaludo)
        btnVolver = findViewById(R.id.btnVolver)

        // obtener el nombre
        val nombre = intent.getStringExtra("nombre")

        // mostrar el saludo
        tvSaludo.text = "Hola  $nombre 👋"

        // evento click del botón de volver
        btnVolver.setOnClickListener {
            // finalizar la actividad
            finish()
        }
    }
}