package com.sematec.taskimdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val film1 = Movie(
            "Chiz-haie hast keh nemidani",
            "2010",
            "Fardin Saheb-Zamani",
            "Mehdi Bajestani, Leila Hatami, Maryam Kazemi",
            R.drawable.mv1
        )
        val film2 = Movie(
            "Barf rooye kajha",
            "2012",
            "Payman Maadi",
            "Saber Abar, Anahita Afshar, Mahnaz Afshar, Vishka Asayesh",
            R.drawable.mv2
        )
        val film3 = Movie(
            "Ghaedeye tasadof",
            "2013",
            "Behnam Behzadi",
            " Amir Jafari, Ashkan Khatibi, Mehrdad Sedighian, Baharan BaniAhmadi",
            R.drawable.mv3
        )
        val film4 = Movie(
            " Man Madar Hastam",
            "2012",
            "Fereydoun Jeyrani",
            " Baran Kosari, Farhad Aslani, Habib Rezaei, Hengameh Ghaziani",
            R.drawable.mv4
        )

        var filmlist = ArrayList<Movie>()
        filmlist.add(film1)
        filmlist.add(film2)
        filmlist.add(film3)
        filmlist.add(film4)
        //var adapter = imdbAdapter(filmist)
        // recycler.adapter = imdbAdapter(filmist, {movie : Movie -> movieclicked(movie) })
        recycler.adapter = imdbAdapter(filmlist, movieclicked)
        recycler.layoutManager =
            LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)

        /* val intent = getIntent()
         val movietitle = intent.getStringExtra("movietitle")
         Toast.makeText(this@MainActivity, "Movie :  ${movietitle}", Toast.LENGTH_SHORT).show() */

    }

    val movieclicked: (Movie) -> Unit = { movie ->
        Toast.makeText(this@MainActivity, "Movie Title is: ${movie.Title}", Toast.LENGTH_SHORT)
            .show()
    }

    /*private fun movieClicked(movie : Movie) {
    Toast.makeText(this, "Movie Title is: ${movie.Title}", Toast.LENGTH_SHORT).show()
}*/

}
