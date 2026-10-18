// util/Extensions.kt
package com.ute.cuuhotulanh.util

import android.content.Context
import android.view.View
import android.widget.Toast

fun View.show() { visibility = View.VISIBLE }
fun View.gone() { visibility = View.GONE }
fun Context.toast(message: String) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()