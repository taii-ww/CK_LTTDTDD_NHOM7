package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.model.Ingredient

class FridgeFragment : Fragment(R.layout.fragment_fridge) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ingredients = listOf(
            Ingredient(
                name = "Trứng gà",
                quantity = 3,
                unit = "quả",
                expiry = "Còn 5 ngày",
                shouldUseSoon = true,
                imageRes = R.drawable.img_food
            ),
            Ingredient(
                name = "Cà chua",
                quantity = 4,
                unit = "quả",
                expiry = "Nên dùng sớm",
                shouldUseSoon = true,
                imageRes = R.drawable.img_food
            ),
            Ingredient(
                name = "Thịt gà",
                quantity = 350,
                unit = "gram",
                expiry = "Còn 8 ngày",
                imageRes = R.drawable.img_food
            ),
            Ingredient(
                name = "Cải xanh",
                quantity = 1,
                unit = "bó",
                expiry = "Còn 2 ngày",
                imageRes = R.drawable.img_food
            ),
            Ingredient(
                name = "Hành tây",
                quantity = 2,
                unit = "củ",
                expiry = "Còn 3 ngày",
                imageRes = R.drawable.img_food
            ),
            Ingredient(
                name = "Bắp cải",
                quantity = 1,
                unit = "củ",
                expiry = "Còn 4 ngày",
                imageRes = R.drawable.img_food
            )
        )

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvIngredients)
        requireNotNull(recyclerView) { "rvIngredients không tồn tại trong fragment_fridge.xml" }

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = IngredientAdapter(ingredients)
    }
}