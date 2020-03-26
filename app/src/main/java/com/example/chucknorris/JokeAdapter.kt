package com.example.chucknorris

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class JokeAdapter(var jokes:List<String> = emptyList()):
    RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {

    var jokesList = jokes // setter
        set(value){
            notifyDataSetChanged()
        }

    class JokeViewHolder(val textView: TextView) :
        RecyclerView.ViewHolder(textView){
        val jokesView = textView.findViewById<TextView>(R.id.jokes_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeAdapter.JokeViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.jokes_view, parent, false) as TextView
        return JokeViewHolder(textView)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.jokesView.text = jokes[position]
    }

    override fun getItemCount() = jokes.size

}