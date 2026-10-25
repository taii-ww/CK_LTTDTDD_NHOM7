package com.ute.cuuhotulanh.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.ute.cuuhotulanh.R
import com.ute.cuuhotulanh.util.StateLayout
import com.ute.cuuhotulanh.util.UiState

class FavoritesFragment : Fragment(R.layout.fragment_favorites) {

    private lateinit var stateLayout: StateLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.rvFavorites)

        stateLayout = StateLayout(view, recyclerView) {
            // TODO: tải lại danh sách yêu thích
            stateLayout.render(UiState.LOADING)
        }
        stateLayout.setEmptyText(
            title = "Chưa có món yêu thích",
            message = "Bấm vào biểu tượng trái tim ở món ăn để lưu lại tại đây"
        )

        // Chưa có dữ liệu yêu thích nên tạm hiện trạng thái rỗng.
        // Để xem từng trạng thái, đổi EMPTY thành LOADING / ERROR / CONTENT
        // (hoặc nhấn giữ tiêu đề để chuyển lần lượt).
        stateLayout.render(UiState.EMPTY)

        // --- DEBUG: xóa khối này khi đã nối dữ liệu thật ---
        var debugIndex = UiState.EMPTY.ordinal
        view.findViewById<View>(R.id.tvTitle).setOnLongClickListener {
            debugIndex = (debugIndex + 1) % UiState.values().size
            stateLayout.render(UiState.values()[debugIndex])
            true
        }
        // --- HẾT DEBUG ---
    }
}