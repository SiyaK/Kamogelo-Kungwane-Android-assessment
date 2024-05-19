package com.glucode.about_you.profileViews

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glucode.about_you.R


class GenericRecyclerViewAdapter {

    class GenericRecyclerViewAdapter<T>(

        private var items: List<T>,
        private val onBind: (View, T) -> Unit,
        private val onItemClick: (T) -> Unit
    ) : RecyclerView.Adapter<GenericRecyclerViewAdapter<T>.ViewHolder>() {

        override fun getItemCount() = items.size

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.view_profile, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            onBind(holder.itemView, items[position])
            holder.itemView.setOnClickListener { onItemClick(items[position]) }
        }

        inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

        private val PICK_IMAGE_REQUEST = 1

        fun updateItems(newItems: List<T>) {
            items = newItems
            notifyDataSetChanged()
        }

        fun onProfileImageClick() {
            openGallery()
        }

        private fun openGallery() {
            val intent = Intent(Intent.ACTION_PICK)
            intent.type = "image/*"
            startActivityForResult(intent, PICK_IMAGE_REQUEST)
        }

        private fun startActivityForResult(intent: Intent, pickImageRequest: Int) {

        }
    }




}