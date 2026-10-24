package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.util.FakeData

class RecipeListFragment : Fragment(R.layout.fragment_recipe_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.btnBack).setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvRecipes)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        // showFavorite = true: thiết kế có tim đỏ trên mỗi thẻ ở màn này
        recyclerView.adapter = RecipeResultAdapter(
            recipes = FakeData.recipes(),
            showFavorite = true
        ) { recipeId ->
            openRecipeDetail(recipeId)
        }
    }

    private fun openRecipeDetail(id: Int) {
        val fragment = RecipeDetailFragment()
        fragment.arguments = Bundle().apply { putInt("id", id) }

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}