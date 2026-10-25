package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.util.FakeData
import com.ute.cuuhotulanh.util.StateLayout
import com.ute.cuuhotulanh.util.UiState

class FavoritesFragment : Fragment(R.layout.fragment_favorites) {

    private lateinit var stateLayout: StateLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvFavorites)

        // Tạm lấy 3 món từ FakeData cho giống thiết kế, sau này thay bằng danh sách yêu thích thật.
        // showFavorite = true: hiện tim đỏ trên mỗi thẻ.
        recyclerView.adapter = RecipeResultAdapter(
            recipes = FakeData.recipes().take(3),
            showFavorite = true
        ) { recipeId ->
            openRecipeDetail(recipeId)
        }

        stateLayout = StateLayout(view, recyclerView) {
            // TODO: tải lại danh sách yêu thích
            stateLayout.render(UiState.LOADING)
        }
        stateLayout.setEmptyText(
            title = "Chưa có món yêu thích",
            message = "Bấm vào biểu tượng trái tim ở món ăn để lưu lại tại đây"
        )

        // Hiện danh sách bình thường. Để xem từng trạng thái, đổi CONTENT thành
        // LOADING / EMPTY / ERROR (hoặc nhấn giữ tiêu đề để chuyển lần lượt).
        stateLayout.render(UiState.CONTENT)

        // --- DEBUG: xóa khối này khi đã nối dữ liệu thật ---
        var debugIndex = UiState.CONTENT.ordinal
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