package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.databinding.FragmentFridgeBinding
import com.ute.cuuhotulanh.model.Ingredient

class FridgeFragment : Fragment(R.layout.fragment_fridge) {

    private lateinit var binding: FragmentFridgeBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFridgeBinding.bind(view)
        val ingredients = listOf(
            Ingredient("Trứng gà", 3, "quả", "Còn 5 ngày", true, R.drawable.img_egg),
            Ingredient("Cà chua", 4, "quả", "Nên dùng sớm", true, R.drawable.img_tomato),
            Ingredient("Thịt gà", 350, "gram", "Còn 8 ngày", false, R.drawable.img_chicken),
            Ingredient("Cải xanh", 1, "bó", "Còn 2 ngày", false, R.drawable.img_vegetable),
            Ingredient("Cá hồi", 1, "kilogram", "Còn 3 ngày", false, R.drawable.img_fish),
            Ingredient("Sữa", 300, "mililit", "Còn 1 ngày", false, R.drawable.img_milk)
        )

        val recyclerView = binding.rvIngredients
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = IngredientAdapter(ingredients)

        val btnAddIngredient = binding.btnAddIngredient
        btnAddIngredient.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, AddIngredientFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
