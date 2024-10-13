package com.example.news

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ArticlesDetail : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_articles_detail)
val title: String? =intent.getStringExtra("title")
        val date: String? =intent.getStringExtra("date")
        val details: String? =intent.getStringExtra("details")
        val author: String? =intent.getStringExtra("author")
        val image:Int=intent.getIntExtra("image", R.drawable.image1)
        findViewById<TextView>(R.id.title).text=title
        findViewById<TextView>(R.id.author).text=author
        findViewById<TextView>(R.id.date).text=date
        findViewById<TextView>(R.id.details).text=details
        findViewById<ImageView>(R.id.image5).setImageResource(image)

    }
}