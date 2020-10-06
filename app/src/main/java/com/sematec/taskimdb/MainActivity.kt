package com.sematec.taskimdb

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Year

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

        var flist = ArrayList<Movie>()
        flist.add(film1)
        flist.add(film2)
        flist.add(film3)
        flist.add(film4)
        var adapter = imdbAdapter(flist)
        recycler.adapter = adapter
        recycler.layoutManager =
            LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)

    }
}
