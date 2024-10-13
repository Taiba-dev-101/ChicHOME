package com.example.news

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class BlogAdapter(val blog: List<Blog>):RecyclerView.Adapter<ArticleViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.article_view, parent, false)
        return ArticleViewHolder(view)
    }
    override fun getItemCount(): Int {
        return blog.size
    }

    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
val blog=blog.get(position)
        holder.title.text=blog.title
        holder.image.setImageResource(blog.image)
        holder.author.text=blog.author
        holder.duration.text=blog.duration
        holder.itemView.setOnClickListener ({
            val intent= Intent(/* packageContext = */ holder.itemView.context,/* cls = */ ArticlesDetail::class.java)
            intent.putExtra("title",blog.title)
            intent.putExtra("image",blog.image)
            intent.putExtra("author",blog.author)
            intent.putExtra("date", blog.date)
            intent.putExtra("details",blog.details)
            holder.itemView.context.startActivity(intent)
            })
    }


}