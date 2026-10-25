package com.ute.cuuhotulanh.util

import android.view.View
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import com.ute.cuuhotulanh.R

/** Các trạng thái hiển thị của một màn danh sách. */
enum class UiState { CONTENT, LOADING, EMPTY, ERROR }

/**
 * Điều khiển layout_state.xml (đã include vào màn hình).
 *
 * @param root    view gốc của màn hình (view truyền vào onViewCreated)
 * @param content view hiển thị khi có dữ liệu (thường là RecyclerView)
 * @param onRetry được gọi khi bấm nút "Thử lại" ở trạng thái lỗi
 *
 * Dùng show() / gone() trong Extensions.kt để bật tắt từng khối.
 */
class StateLayout(
    root: View,
    private val content: View,
    onRetry: () -> Unit = {}
) {
    private val stateRoot: View = root.findViewById(R.id.stateRoot)
    private val loading: View = root.findViewById(R.id.layoutLoading)
    private val empty: View = root.findViewById(R.id.layoutEmpty)
    private val error: View = root.findViewById(R.id.layoutError)

    private val tvEmptyTitle: TextView = root.findViewById(R.id.tvEmptyTitle)
    private val tvEmptyMessage: TextView = root.findViewById(R.id.tvEmptyMessage)
    private val tvErrorTitle: TextView = root.findViewById(R.id.tvErrorTitle)
    private val tvErrorMessage: TextView = root.findViewById(R.id.tvErrorMessage)

    init {
        root.findViewById<MaterialButton>(R.id.btnRetry).setOnClickListener { onRetry() }
    }

    /** Đổi nội dung chữ của trạng thái rỗng (vd: màn Yêu thích). */
    fun setEmptyText(title: String, message: String) {
        tvEmptyTitle.text = title
        tvEmptyMessage.text = message
    }

    /** Đổi nội dung chữ của trạng thái lỗi nếu cần. */
    fun setErrorText(title: String, message: String) {
        tvErrorTitle.text = title
        tvErrorMessage.text = message
    }

    /** Chỉ một khối được hiện tại một thời điểm. */
    fun render(state: UiState) {
        if (state == UiState.CONTENT) content.show() else content.gone()
        if (state == UiState.LOADING) loading.show() else loading.gone()
        if (state == UiState.EMPTY) empty.show() else empty.gone()
        if (state == UiState.ERROR) error.show() else error.gone()

        // Không để lớp phủ chặn thao tác chạm vào danh sách khi đang hiện nội dung
        if (state == UiState.CONTENT) stateRoot.gone() else stateRoot.show()
    }
}