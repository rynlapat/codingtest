package com.example.codingtest2.ui

import android.content.ClipData
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.codingtest2.R
import com.example.codingtest2.api.Article
import com.example.codingtest2.databinding.ArticleItemBinding

class MainAdapter() : ListAdapter<Article,MainAdapter.ViewHolder>(MainDiffCallback()){

    var onItemClick : ((Article) -> Unit)? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ArticleItemBinding.inflate(inflater,parent,false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
        /*holder.itemView.setOnClickListener {
            /*onItemClick?.invoke(Article)*/
        }*/


    }
    class ViewHolder (private val binding : ArticleItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(article: Article){
            binding.article = article
            binding.executePendingBindings()


        }
       /* val Itemimage:ImageView = itemView.findViewById(R.id.image)
        val Itemtltle:TextView = itemView.findViewById(R.id.titlename)
        val Itemauthor:TextView = itemView.findViewById(R.id.author)
        val Itemdescription:TextView = itemView.findViewById(R.id.description)
        init {
            itemView.setOnClickListener { View->
                val position: Int = adapterPosition
                Toast.makeText(itemView.context,"You clicked on item ${position+1}",Toast.LENGTH_SHORT)
            }
        }*/
    }
}
class MainDiffCallback : DiffUtil.ItemCallback<Article>(){
    override fun areItemsTheSame(oldItem: Article, newItem: Article): Boolean {
        return false
    }

    override fun areContentsTheSame(oldItem: Article, newItem: Article): Boolean {
        return oldItem == newItem
    }

}


