package com.ute.cuuhotulanh.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.model.Ingredient

class IngredientAdapter(
    private val ingredients: List<Ingredient>
) : RecyclerView.Adapter<IngredientAdapter.IngredientViewHolder>() {

    class IngredientViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivIcon: ImageView = itemView.findViewById(R.id.ivIngredientIcon)
        val tvName: TextView = itemView.findViewById(R.id.tvIngredientName)
        val tvMeta: TextView = itemView.findViewById(R.id.tvIngredientMeta)
        val tvUseSoon: TextView = itemView.findViewById(R.id.tvUseSoon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_ingredient, parent, false)
        return IngredientViewHolder(view)
    }

    override fun onBindViewHolder(holder: IngredientViewHolder, position: Int) {
        val ingredient = ingredients[position]

        holder.ivIcon.setImageResource(ingredient.imageRes)
        holder.tvName.text = ingredient.name
        holder.tvMeta.text = "${ingredient.quantity} ${ingredient.unit} · ${ingredient.expiry}"

        if (ingredient.shouldUseSoon) {
            holder.tvUseSoon.visibility = View.VISIBLE
        } else {
            holder.tvUseSoon.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int = ingredients.size
}