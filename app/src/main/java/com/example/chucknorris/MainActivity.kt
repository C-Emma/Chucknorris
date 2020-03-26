package com.example.chucknorris

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.serialization.*
import kotlinx.serialization.json.*



private val LOGTAG = "Activity"


class MainActivity : AppCompatActivity() {

    private lateinit var adapter: JokeAdapter
    private lateinit var layoutManager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(LOGTAG, JokesList.jokes.toString())

        layoutManager = LinearLayoutManager(this)
        id_recyclerView.layoutManager = layoutManager
        //viewAdapter = JokeAdapter(JokesList.jokes)

        //Initialisation du recyclerView
        adapter = JokeAdapter(JokesList.jokes)
        id_recyclerView.adapter = adapter


        //recyclerView = findViewById<RecyclerView>(R.id.id_recyclerView).apply {
          //  setHasFixedSize(true)
            //layoutManager = viewManager
            //adapter = viewAdapter
        //}
    }

}
