package com.sematec.taskimdb

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_item.view.*


class imdbAdapter(private var list: ArrayList<Movie>) :
    RecyclerView.Adapter<imdbAdapter.imdbViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): imdbViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_item, parent, false)
        return imdbViewHolder(view)
    }

    override fun onBindViewHolder(holder: imdbViewHolder, position: Int) =
        holder.bind(list[position])

    override fun getItemCount() = list.size

    class imdbViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val txttile: TextView = itemView.findViewById(R.id.txtTitle)
        private val txtyear: TextView = itemView.findViewById(R.id.txtYear)
        private val txtdirector: TextView = itemView.findViewById(R.id.txtDirector)
        private val txtactors: TextView = itemView.findViewById(R.id.txtActors)
        private val imgposter: ImageView = itemView.findViewById(R.id.imgPoster)
        fun bind(movie: Movie) {
            txttile.text = movie.Title
            txtyear.text = movie.Year
            txtdirector.text = movie.Director
            txtactors.text = movie.Actors
            imgposter.setImageResource(movie.Poster)
        }

    }

}



