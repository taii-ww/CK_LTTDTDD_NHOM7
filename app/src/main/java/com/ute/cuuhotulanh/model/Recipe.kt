package com.ute.cuuhotulanh.model

import com.ute.cuuhotulanh.R

data class Recipe(
    val id: Int,
    val name: String,
    val image:Int ,
    val time: Int,
    val ingredientEnough: String,
    val ingredientMiss: String
)