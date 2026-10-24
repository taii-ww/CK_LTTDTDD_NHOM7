package com.ute.cuuhotulanh.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.model.Recipe
import com.ute.cuuhotulanh.util.gone
import com.ute.cuuhotulanh.util.show

class RecipeResultAdapter(
    private val recipes: List<Recipe>,
    private val showFavorite: Boolean = false,
    private val onItemClick: (Int) -> Unit = {}
) : RecyclerView.Adapter<RecipeResultAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imageRecipe)
        val name: TextView = itemView.findViewById(R.id.tvRecipeName)
        val time: TextView = itemView.findViewById(R.id.tvTime)
        val enough: TextView = itemView.findViewById(R.id.tvIngredientStatusEnough)
        val miss: TextView = itemView.findViewById(R.id.tvIngredientStatusMiss)
        val cardFavorite: View = itemView.findViewById(R.id.cardFavorite)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe_result, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipe = recipes[position]
        holder.image.setImageResource(recipe.image)
        holder.name.text = recipe.name
        holder.time.text = "${recipe.time} phút"
        holder.enough.text = recipe.ingredientEnough
        holder.miss.text = recipe.ingredientMiss

        // Mặc định ẩn tim. Màn Yêu thích sẽ truyền showFavorite = true
        if (showFavorite) holder.cardFavorite.show() else holder.cardFavorite.gone()

        holder.itemView.setOnClickListener { onItemClick(recipe.id) }
    }

    override fun getItemCount(): Int = recipes.size
}