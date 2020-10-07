package com.sematec.taskimdb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class imdbAdapter(var list: ArrayList<Movie>, val clickListener: (Movie) -> Unit) :
    RecyclerView.Adapter<imdbAdapter.imdbViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): imdbViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_item, parent, false)
        return imdbViewHolder(view)
    }

    override fun onBindViewHolder(holder: imdbViewHolder, position: Int) =
        holder.bind(list[position], clickListener)

    override fun getItemCount() = list.size

    class imdbViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val txttile: TextView = itemView.findViewById(R.id.txtTitle)
        private val txtyear: TextView = itemView.findViewById(R.id.txtYear)
        private val txtdirector: TextView = itemView.findViewById(R.id.txtDirector)
        private val txtactors: TextView = itemView.findViewById(R.id.txtActors)
        private val imgposter: ImageView = itemView.findViewById(R.id.imgPoster)
        fun bind(movie: Movie, clickListener: (Movie) -> Unit) {

            txttile.text = movie.Title
            txtyear.text = movie.Year
            txtdirector.text = movie.Director
            txtactors.text = movie.Actors
            imgposter.setImageResource(movie.Poster)

            itemView.setOnClickListener {
                clickListener(movie)

                //val position: Int = adapterPosition
                /* Toast.makeText(itemView.context, "Movie Title is :  ${movie.Title}", Toast.LENGTH_SHORT).show()
                val intent = Intent()
                intent.setClass(itemView.context,MainActivity::class.java)
                intent.putExtra("movietitle", movie.Title)*/
            }
        }

    }
}




