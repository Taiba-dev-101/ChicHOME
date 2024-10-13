package com.example.news

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ArticleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(R.id.title)
    val image: ImageView = itemView.findViewById( R.id.image)
    val author: TextView = itemView.findViewById(R.id.author)
    val duration: TextView = itemView.findViewById(R.id.duration)

}