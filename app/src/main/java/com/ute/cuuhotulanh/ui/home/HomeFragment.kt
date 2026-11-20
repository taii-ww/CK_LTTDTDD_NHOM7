package com.ute.cuuhotulanh.ui.home

import android.os.Bundle
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.databinding.FragmentHomeBinding
import com.ute.cuuhotulanh.model.Recipe
import com.ute.cuuhotulanh.ui.RecipeDetailFragment
import com.ute.cuuhotulanh.ui.RecipeListFragment

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var binding: FragmentHomeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding = FragmentHomeBinding.bind(view)
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
        val adapter = RecipeAdapter(listRecipe) { selectedId ->
            navigateToRecipeDetail(selectedId)
        }
        binding.rvSuggestions.adapter = adapter

        setupIngredientInput(view)
        binding.btnSearch.setOnClickListener {
            navigateToRecipeList(getIngredients(view))
        }
    }

    private fun setupIngredientInput(view: View) {
        val inputLayout = binding.textInputLayoutIngredients
        val editText = binding.editTextIngredients
        val chipGroup = binding.chipGroupIngredients

        fun addChip() {
            val name = editText.text?.toString()?.trim().orEmpty()
            if (name.isEmpty()) return

            val exists = (0 until chipGroup.childCount).any {
                (chipGroup.getChildAt(it) as Chip).text.toString().equals(name, ignoreCase = true)
            }
            if (!exists) {
                val chip = Chip(requireContext()).apply {
                    text = name
                    isCloseIconVisible = true
                    setOnCloseIconClickListener { chipGroup.removeView(this) }
                }
                chipGroup.addView(chip)
            }
            editText.text?.clear()
        }

        inputLayout.setEndIconOnClickListener { addChip() }
        editText.imeOptions = EditorInfo.IME_ACTION_DONE
        editText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                addChip()
                true
            } else {
                false
            }
        }
    }

    private fun getIngredients(view: View): List<String> {
        val chipGroup = binding.chipGroupIngredients
        return (0 until chipGroup.childCount).map {
            (chipGroup.getChildAt(it) as Chip).text.toString()
        }
    }

    private fun navigateToRecipeDetail(id: Int) {
        val fragment = RecipeDetailFragment()

        val bundle = Bundle()
        bundle.putInt("id", id)
        fragment.arguments = bundle

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }

    private fun navigateToRecipeList(ingredients: List<String>) {
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