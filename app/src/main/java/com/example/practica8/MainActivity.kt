package com.example.practica8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    private fun generarDatos(): ArrayList<Pelicula> {
        val lista = ArrayList<Pelicula>()

        lista.add(
            Pelicula(R.drawable.img1, "Titulo 1", "Genero 1", 4.2, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img2, "Titulo 2", "Genero 2", 4.2, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img3, "Titulo 2", "Genero 2", 4.2, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img3, "Titulo 3", "Genero 2", 4.2, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img4, "Titulo 4", "Genero 2", 4.2, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img5, "Titulo 5", "Genero 2", 4.2, 190, "02/02/2023")
        )

        return lista
    }
}