package com.ute.cuuhotulanh.model

data class Recipe(
    val id: Int,
    val title: String,
    val imageRes: Int,                       // sau này đổi thành imageUrl khi gọi API
    val readyInMinutes: Int,
    val usedCount: Int,
    val missedCount: Int,
    val ingredients: List<String> = emptyList(),
    val steps: List<String> = emptyList()
)