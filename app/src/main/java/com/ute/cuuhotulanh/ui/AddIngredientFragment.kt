package com.ute.cuuhotulanh.ui

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.ute.cuuhotulanh.R
import java.util.Calendar

class AddIngredientFragment : Fragment(R.layout.fragment_add_ingredient) {

    private var selectedCategory: String = "Rau củ"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnBack = view.findViewById<ImageButton>(R.id.btnBack)
        val etIngredientName = view.findViewById<TextInputEditText>(R.id.etIngredientName)
        val etQuantity = view.findViewById<TextInputEditText>(R.id.etQuantity)
        val autoUnit = view.findViewById<AutoCompleteTextView>(R.id.autoUnit)
        val etExpiryDate = view.findViewById<TextInputEditText>(R.id.etExpiryDate)
        val btnSave = view.findViewById<MaterialButton>(R.id.btnSaveIngredient)

        btnBack.setOnClickListener { parentFragmentManager.popBackStack() }

        val units = listOf("Quả", "Gram", "Kg", "Lít", "Hộp", "Bó")
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_dropdown_item_1line, units)
        autoUnit.setAdapter(adapter)
        autoUnit.setText("Quả", false)

        val calendar = Calendar.getInstance()
        etExpiryDate.setOnClickListener {
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)

            DatePickerDialog(
                requireContext(),
                { _, selectedYear, selectedMonth, selectedDay ->
                    val formatted = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                    etExpiryDate.setText(formatted)
                },
                year, month, day
            ).show()
        }

        val categoryButtons = listOf(
            R.id.btnCategoryVegetable to "Rau củ",
            R.id.btnCategoryMeat to "Thịt",
            R.id.btnCategoryWater to "Nước",
            R.id.btnCategoryEgg to "Trứng",
            R.id.btnCategoryFruit to "Trái cây",
            R.id.btnCategoryFish to "Cá",
            R.id.btnCategoryDry to "Đồ khô",
            R.id.btnCategoryOther to "Khác"
        )

        categoryButtons.forEach { (buttonId, categoryName) ->
            val button = view.findViewById<MaterialButton>(buttonId)
            button.setOnClickListener {
                selectedCategory = categoryName
                updateCategorySelection(view, categoryButtons)
            }
        }

        updateCategorySelection(view, categoryButtons)

        btnSave.setOnClickListener {
            val name = etIngredientName.text?.toString()?.trim().orEmpty()
            val quantity = etQuantity.text?.toString()?.trim().orEmpty()
            val expiry = etExpiryDate.text?.toString()?.trim().orEmpty()

            if (name.isBlank() || quantity.isBlank() || expiry.isBlank()) {
                Toast.makeText(requireContext(), "Vui lòng nhập đầy đủ thông tin", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(
                requireContext(),
                "Đã thêm nguyên liệu: $name ($selectedCategory)",
                Toast.LENGTH_SHORT
            ).show()

            parentFragmentManager.popBackStack()
        }
    }

    private fun updateCategorySelection(view: View, categoryButtons: List<Pair<Int, String>>) {
        categoryButtons.forEach { (buttonId, categoryName) ->
            val button = view.findViewById<MaterialButton>(buttonId)
            val isSelected = categoryName == selectedCategory

            button.isSelected = isSelected
            button.setBackgroundTintList(
                ContextCompat.getColorStateList(
                    requireContext(),
                    if (isSelected) R.color.green_light else R.color.white
                )
            )
            button.setTextColor(
                ContextCompat.getColor(
                    requireContext(),
                    if (isSelected) R.color.green_dark else R.color.gray_dark
                )
            )
            button.strokeColor = ContextCompat.getColorStateList(requireContext(), R.color.gray_light)
        }
    }
}
