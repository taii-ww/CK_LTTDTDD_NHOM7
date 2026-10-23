package com.ute.cuuhotulanh.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.MainActivity
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.model.Recipe
import com.ute.cuuhotulanh.ui.RecipeDetailFragment
import com.ute.cuuhotulanh.ui.RecipeListFragment

class HomeFragment : Fragment(R.layout.fragment_home){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listRecipe: List<Recipe> = listOf(
            Recipe(
                1,
                "Trứng xào cà chua",
                R.drawable.img_food,
                13,
                "Có 3 nguyên liệu",
                "Có 3 nguyên liệu"
            ),
            Recipe(
                2,
                "Bún đậu mắm tôm",
                R.drawable.img_food,
                13,
                "Có 3 nguyên liệu",
                "Có 3 nguyên liệu"
            ),
            Recipe(
                3,
                "Bánh mì chảo",
                R.drawable.img_food,
                13,
                "Có 3 nguyên liệu",
                "Có 3 nguyên liệu"
            ),
            Recipe(
                4,
                "Bánh mì chảo",
                R.drawable.img_food,
                13,
                "Có 3 nguyên liệu",
                "Có 3 nguyên liệu"
            ),
        )
        val adapter = RecipeAdapter(listRecipe){ selectedId ->
            navigateToRecipeDetail(selectedId)
        }
        view.findViewById<RecyclerView>(R.id.rvSuggestions).adapter = adapter
    }
    private fun navigateToRecipeDetail(id : Int){
        val fragment = RecipeDetailFragment()

        val bundle = Bundle()
        bundle.putInt("id", id)
        fragment.arguments = bundle

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
    private fun navigateToRecipeList(ingredients : List<String>){
        val fragment = RecipeListFragment()

        val bundle = Bundle()
        bundle.putStringArrayList("ingredients", ArrayList(ingredients))
        fragment.arguments = bundle

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}