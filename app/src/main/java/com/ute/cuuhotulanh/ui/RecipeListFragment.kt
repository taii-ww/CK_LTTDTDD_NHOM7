package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.util.FakeData
import com.ute.cuuhotulanh.util.StateLayout
import com.ute.cuuhotulanh.util.UiState

class RecipeListFragment : Fragment(R.layout.fragment_recipe_list) {

    private lateinit var stateLayout: StateLayout
    private lateinit var recyclerView: RecyclerView
    private lateinit var tvResultCount: TextView
    private lateinit var btnFewIngredients: MaterialButton
    private lateinit var btnQuick: MaterialButton

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.btnBack).setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        recyclerView = view.findViewById(R.id.rvRecipes)
        tvResultCount = view.findViewById(R.id.tvResultCount)
        btnFewIngredients = view.findViewById(R.id.chipFewIngredients)
        btnQuick = view.findViewById(R.id.chipQuick)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        // Dòng "Với trứng, cà chua, thịt cá,..." theo nguyên liệu nhận từ Home
        val ingredients = arguments?.getStringArrayList("ingredients").orEmpty()
        view.findViewById<TextView>(R.id.tvIngredientsSummary).text = when {
            ingredients.isEmpty() -> "Với nguyên liệu trong tủ lạnh của bạn"
            ingredients.size <= 3 -> "Với " + ingredients.joinToString(", ")
            else -> "Với " + ingredients.take(3).joinToString(", ") + ",..."
        }

        stateLayout = StateLayout(view, recyclerView) {
            // TODO: gọi lại API khi bấm "Thử lại" (tạm giả lập tải lại)
            stateLayout.render(UiState.LOADING)
            view.postDelayed({ applyFilters() }, 800)
        }
        stateLayout.setEmptyText(
            title = "Chưa tìm thấy món phù hợp",
            message = "Thử thêm nguyên liệu hoặc bỏ bớt bộ lọc nhé"
        )

        // Bấm nút lọc để bật/tắt, danh sách cập nhật ngay
        btnFewIngredients.addOnCheckedChangeListener { _, _ -> applyFilters() }
        btnQuick.addOnCheckedChangeListener { _, _ -> applyFilters() }

        applyFilters()

        // --- DEBUG: nhấn giữ tiêu đề để xem lần lượt các trạng thái. Xóa khi đã nối API thật ---
        var debugIndex = UiState.CONTENT.ordinal
        view.findViewById<View>(R.id.tvTitle).setOnLongClickListener {
            debugIndex = (debugIndex + 1) % UiState.values().size
            stateLayout.render(UiState.values()[debugIndex])
            true
        }
        // --- HẾT DEBUG ---
    }

    /**
     * Lọc theo dữ liệu giả:
     * - "Nấu nhanh": chỉ giữ món có thời gian <= 15 phút
     * - "Ít nguyên liệu nhất": sắp xếp món thiếu ít nguyên liệu lên trước
     */
    private fun applyFilters() {
        var recipes = FakeData.recipes()

        if (btnQuick.isChecked) {
            recipes = recipes.filter { it.time <= 15 }
        }
        if (btnFewIngredients.isChecked) {
            recipes = recipes.sortedBy { missingCount(it.ingredientMiss) }
        }

        // showFavorite = true: thiết kế có tim đỏ trên mỗi thẻ ở màn này
        recyclerView.adapter = RecipeResultAdapter(
            recipes = recipes,
            showFavorite = true
        ) { recipeId ->
            openRecipeDetail(recipeId)
        }

        tvResultCount.text = "Tìm thấy ${recipes.size} món phù hợp"
        stateLayout.render(if (recipes.isEmpty()) UiState.EMPTY else UiState.CONTENT)
    }

    /** "Thiếu 2" -> 2 */
    private fun missingCount(text: String): Int =
        text.filter { it.isDigit() }.toIntOrNull() ?: 0

    private fun openRecipeDetail(id: Int) {
        val fragment = RecipeDetailFragment()
        fragment.arguments = Bundle().apply { putInt("id", id) }

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}