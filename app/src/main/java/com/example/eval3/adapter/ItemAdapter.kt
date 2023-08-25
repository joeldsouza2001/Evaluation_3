package com.example.eval3.adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.eval3.R
import com.example.eval3.model.Item

class ItemAdapter(private val context: Context,private val dataset:List<Item>):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){


    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){
        val textView:TextView = view.findViewById(R.id.text)
        val imageView: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutadapter = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(layoutadapter)
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val curItem = dataset[position]
        holder.textView.text = curItem.text
        holder.imageView.setImageResource(curItem.image)
    }
}