package com.example.chucknorris

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class JokeAdapter(var jokes:List<String> = emptyList()):
    RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {

    var jokesList = jokes // setter
        set(value){
            notifyDataSetChanged()
        }

    class JokeViewHolder(val textView: TextView) :
        RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeAdapter.JokeViewHolder {
        val textView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main, parent, false) as TextView
        return JokeViewHolder(textView)
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.textView.text = jokes[position]
    }

    override fun getItemCount() = jokes.size

    //override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
    //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    //}

    //override fun getItemCount(): Int {
    //  TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    //}
}