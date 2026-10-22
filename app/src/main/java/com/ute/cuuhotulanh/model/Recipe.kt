package com.ute.cuuhotulanh.model

data class Recipe(
    val id: Int,
    val name: String,
    val image: Int,                       // sau này đổi thành imageUrl khi gọi API
    val time: Int,
    val ingredientStatus: String
)