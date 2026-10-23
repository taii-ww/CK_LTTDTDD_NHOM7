package com.ute.cuuhotulanh.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.model.Recipe

class RecipeAdapter (private val recipes: List<Recipe>) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {
    class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.imageRecipe)
        val tvRecipeName = itemView.findViewById<TextView>(R.id.tvRecipeName)
        val tvTime = itemView.findViewById<TextView>(R.id.tvTime)
        val tvIngredientEnough = itemView.findViewById<TextView>(R.id.tvIngredientStatusEnough)
        val tvIngredientMiss = itemView.findViewById<TextView>(R.id.tvIngredientStatusMiss)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_recipe, parent, false)
        return RecipeViewHolder(view)
    }
    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.imageView?.setImageResource(recipe.image)
        holder.tvRecipeName.text = recipe.name
        holder.tvTime.text = "${recipe.time} phút"
        holder.tvIngredientEnough.text = recipe.ingredientEnough
        holder.tvIngredientMiss.text = recipe.ingredientMiss
    }
    override fun getItemCount(): Int {
        return recipes.size
    }
}