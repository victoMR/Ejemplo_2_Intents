package com.example.ejemplo2intents

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // atrivutos
    private lateinit var etNombre : EditText
    private lateinit var btnEnviar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inicializar atributos
        etNombre = findViewById(R.id.etNombre)
        btnEnviar = findViewById(R.id.btnEnviar)

        // evento click del botón
        btnEnviar.setOnClickListener {

            // crear el intent
            val intent = Intent(this@MainActivity,SaludoActivity::class.java)

            // delcaramos los extras
            val nombre = etNombre.text.toString()
            intent.putExtra("nombre",nombre)

            // si esta vacio el nombre
            if(nombre.isEmpty()){
                // mostrar mensaje
                etNombre.error = "Debe ingresar un nombre"
                // salir de la función
                return@setOnClickListener
            }

            // iniciar la actividad
            startActivity(intent)
        }
    }
}