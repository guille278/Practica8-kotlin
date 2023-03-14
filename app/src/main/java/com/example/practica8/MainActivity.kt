package com.example.practica8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var myRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.rv_peliculas)

        myRecyclerView.adapter = PeliculaAdapter(generarDatos())
        myRecyclerView.layoutManager = LinearLayoutManager(baseContext)

    }

    private fun generarDatos(): ArrayList<Pelicula> {
        val lista = ArrayList<Pelicula>()

        lista.add(
            Pelicula(R.drawable.img1, "Titulo 1", "Genero 1", 3.2, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img2, "Titulo 2", "Genero 2", 5.0, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img3, "Titulo 3", "Genero 3", 4.2, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img4, "Titulo 3", "Genero 3", 3.2, 190, "02/02/2023")
        )
        lista.add(
            Pelicula(R.drawable.img5, "Titulo 5", "Genero 2", 2.0, 190, "02/02/2023")
        )

        return lista
    }
}