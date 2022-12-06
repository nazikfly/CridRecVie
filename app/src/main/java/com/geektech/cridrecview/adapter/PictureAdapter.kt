package com.geektech.cridrecview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.geektech.cridrecview.databinding.ItemPictureBinding

class PictureAdapter(
    private var context: Context?,
    private val data: java.util.ArrayList<String>?,
    private var onClick: (pos:Int )->Unit
            ):
    RecyclerView.Adapter<PictureAdapter.PictureViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureViewHolder {
        val context = parent.context
        return PictureViewHolder(
           ItemPictureBinding.inflate(
               LayoutInflater.from(parent.context),
               parent,false)
           )
    }
    override fun onBindViewHolder(holder: PictureViewHolder, position: Int) {
        holder.onBind(data!![position] )
        }
    override fun getItemCount() = data!!.size

    inner class PictureViewHolder(private val binding: ItemPictureBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {

                if (binding.ivSelect.visibility==View.INVISIBLE) {
                    binding.ivSelect.visibility = View.VISIBLE
                }else{
                    binding.ivSelect.visibility=View.INVISIBLE
                }
                onClick(adapterPosition)
            }
        }
        fun onBind(picture: String) {
            Glide.with(binding.ivImage).load(picture).into(binding.ivImage)
        }

    }
}


