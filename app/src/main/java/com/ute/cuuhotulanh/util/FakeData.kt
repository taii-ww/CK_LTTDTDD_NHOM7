package com.ute.cuuhotulanh.util

import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.model.Recipe

object FakeData {
    fun recipes(): List<Recipe> = listOf(
        Recipe(1, "Trứng xào cà chua", R.drawable.img_food, 13, "Có 3 nguyên liệu", "Thiếu 1"),
        Recipe(2, "Bún đậu mắm tôm", R.drawable.img_food, 25, "Có 4 nguyên liệu", "Thiếu 2"),
        Recipe(3, "Bánh mì chảo", R.drawable.img_food, 15, "Có 2 nguyên liệu", "Thiếu 1"),
        Recipe(4, "Cơm tấm sườn", R.drawable.img_food, 30, "Có 5 nguyên liệu", "Thiếu 3")
    )
}