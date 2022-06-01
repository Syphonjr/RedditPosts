package com.example.redditposts.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.redditposts.databinding.OverviewRowBinding

class OverviewAdapter (): RecyclerView.Adapter<OverviewAdapter.OverviewViewHolder>() {

    class OverviewViewHolder(itemBinding: OverviewRowBinding): RecyclerView.ViewHolder(itemBinding.root) {
        // Declare all uiviews that are needed
        val titleView: TextView = itemBinding.tvTitle
        val descriptionView: TextView = itemBinding.tvDescription
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OverviewViewHolder {
        val itemBinding = OverviewRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OverviewViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: OverviewViewHolder, position: Int) {
        holder.apply {
            titleView.text = "Hellooooo"
            descriptionView.text = "world"
        }
    }

    override fun getItemCount(): Int = 5
}