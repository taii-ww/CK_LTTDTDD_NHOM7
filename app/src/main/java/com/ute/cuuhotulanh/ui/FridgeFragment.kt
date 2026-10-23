package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.model.Ingredient

class FridgeFragment : Fragment(R.layout.fragment_fridge) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ingredients = listOf(
            Ingredient("Trứng gà", 3, "quả", "Còn 5 ngày", true, R.drawable.img_food),
            Ingredient("Cà chua", 4, "quả", "Nên dùng sớm", true, R.drawable.img_food),
            Ingredient("Thịt gà", 350, "gram", "Còn 8 ngày", false, R.drawable.img_food),
            Ingredient("Cải xanh", 1, "bó", "Còn 2 ngày", false, R.drawable.img_food),
            Ingredient("Hành tây", 2, "củ", "Còn 3 ngày", false, R.drawable.img_food),
            Ingredient("Bắp cải", 1, "củ", "Còn 4 ngày", false, R.drawable.img_food)
        )

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvIngredients)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = IngredientAdapter(ingredients)

        val btnAddIngredient = view.findViewById<ExtendedFloatingActionButton>(R.id.btnAddIngredient)
        btnAddIngredient.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, AddIngredientFragment())
                .addToBackStack(null)
                .commit()
        }
    }
}
