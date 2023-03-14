package com.example.practica8

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PeliculaAdapter(private val lista : ArrayList<Pelicula>) : RecyclerView.Adapter<PeliculaAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imagen : ImageView
        var titulo : TextView
        var genero : TextView
        var calificacion : RatingBar
        init {
            imagen = itemView.findViewById(R.id.iv_imagen)
            titulo = itemView.findViewById(R.id.tv_titulo)
            genero = itemView.findViewById(R.id.tv_genero)
            calificacion = itemView.findViewById(R.id.rb_calificacion)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lista_peliculas, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lista.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imagen.setImageResource(lista[position].imagen)
        holder.titulo.setText(lista[position].titulo)
        holder.genero.setText(lista[position].genero)
        holder.calificacion.rating = lista[position].calificacion.toFloat()
    }
}