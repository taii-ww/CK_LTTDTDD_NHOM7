package com.ute.cuuhotulanh.model

data class Ingredient(
    val name: String,
    val quantity: Int,
    val unit: String,
    val expiry: String,
    val shouldUseSoon: Boolean = false,
    val imageRes: Int
)