package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.ute.cuuhotulanh.R
class RecipeDetailFragment : Fragment(R.layout.fragment_recipe_detail) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.btnBack).setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

}