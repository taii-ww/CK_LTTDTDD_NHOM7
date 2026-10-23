package com.ute.cuuhotulanh.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.model.Recipe

class HomeFragment : Fragment(R.layout.fragment_home){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listRecipe: List<Recipe> = listOf(
            Recipe(1, "Trứng xào cà chua",  R.drawable.img_food,13, "Có 3 nguyên liệu", "Có 3 nguyên liệu"),
            Recipe(2, "Bún đậu mắm tôm",  R.drawable.img_food,13, "Có 3 nguyên liệu", "Có 3 nguyên liệu"),
            Recipe(3, "Bánh mì chảo",  R.drawable.img_food,13, "Có 3 nguyên liệu", "Có 3 nguyên liệu"),
            Recipe(4, "Bánh mì chảo",  R.drawable.img_food,13, "Có 3 nguyên liệu", "Có 3 nguyên liệu"),
        )
        val adapter = RecipeAdapter(listRecipe)
        view.findViewById<RecyclerView>(R.id.rvSuggestions).adapter = adapter
    }
}