package com.example.localjob.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.localjob.R
import kotlinx.android.synthetic.main.item_tag.view.*

/**
 * Created by schecterza on 7/21/2017 AD.
 */

class SearchTagAdapter(mContext: Context) : RecyclerView.Adapter<SearchTagAdapter.ViewHolder>() {

    var tags: Array<String>

    init {
        tags = mContext.resources.getStringArray(R.array.tags)
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder!!.bindData(holder.itemView, tags[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        var v = LayoutInflater.from(parent!!.context).inflate(R.layout.item_tag, parent, false)
        var viewHolder = ViewHolder(v)
        return viewHolder
    }

    override fun getItemCount(): Int = tags!!.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindData(itemView: View, data: String) {
            itemView.item_tag.text = data
        }
    }
}