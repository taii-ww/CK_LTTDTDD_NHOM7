package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.util.FakeData
import com.ute.cuuhotulanh.util.StateLayout
import com.ute.cuuhotulanh.util.UiState

class RecipeListFragment : Fragment(R.layout.fragment_recipe_list) {

    private lateinit var stateLayout: StateLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.btnBack).setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvRecipes)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        // showFavorite = true: thiết kế có tim đỏ trên mỗi thẻ ở màn này
        recyclerView.adapter = RecipeResultAdapter(
            recipes = FakeData.recipes(),
            showFavorite = true
        ) { recipeId ->
            openRecipeDetail(recipeId)
        }

        stateLayout = StateLayout(view, recyclerView) {
            // TODO: gọi lại API khi bấm "Thử lại"
            stateLayout.render(UiState.LOADING)
        }
        stateLayout.setEmptyText(
            title = "Chưa tìm thấy món phù hợp",
            message = "Thử thêm nguyên liệu hoặc bỏ bớt bộ lọc nhé"
        )

        // Hiện danh sách bình thường. Để xem từng trạng thái, đổi CONTENT thành
        // LOADING / EMPTY / ERROR (hoặc nhấn giữ tiêu đề để chuyển lần lượt).
        stateLayout.render(UiState.CONTENT)

        // --- DEBUG: xóa khối này khi đã nối API thật ---
        var debugIndex = 0
        view.findViewById<View>(R.id.tvTitle).setOnLongClickListener {
            debugIndex = (debugIndex + 1) % UiState.values().size
            stateLayout.render(UiState.values()[debugIndex])
            true
        }
        // --- HẾT DEBUG ---
    }

    private fun openRecipeDetail(id: Int) {
        val fragment = RecipeDetailFragment()
        fragment.arguments = Bundle().apply { putInt("id", id) }

        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}