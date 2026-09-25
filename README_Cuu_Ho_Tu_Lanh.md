# 🥘 Cứu Hộ Tủ Lạnh

**Leftover Recipe Finder** – Ứng dụng Android hỗ trợ tìm kiếm món ăn dựa trên những nguyên liệu còn lại trong tủ lạnh.

## 📱 Giới thiệu

**Cứu Hộ Tủ Lạnh** là một ứng dụng Android hỗ trợ người dùng lựa chọn và chuẩn bị món ăn dựa trên những nguyên liệu sẵn có.

Người dùng có thể nhập các nguyên liệu đang có, từ đó ứng dụng đưa ra những món ăn phù hợp cùng các thông tin cần thiết như:

- Tên món ăn
- Hình ảnh món ăn
- Nguyên liệu
- Mức độ phù hợp / số nguyên liệu còn thiếu
- Công thức và các bước chế biến

Đề tài hướng đến việc tận dụng tốt hơn các nguyên liệu có sẵn, giảm lãng phí thực phẩm và tiết kiệm thời gian lựa chọn món ăn.

## 🎯 Mục tiêu

- Cho phép người dùng nhập **2–3 nguyên liệu** còn thừa.
- Tìm kiếm và trả về danh sách các món ăn phù hợp.
- Hiển thị kết quả trực quan kèm hình ảnh.
- Cho biết món ăn đủ hoặc thiếu bao nhiêu nguyên liệu.
- Cho phép xem chi tiết công thức của món ăn.
- Áp dụng các kỹ thuật lập trình Android đã học như **ViewBinding, Scope Functions, Extension Functions, xử lý sự kiện và Activity Lifecycle**.

## 👥 Đối tượng sử dụng

Ứng dụng hướng đến:

- Sinh viên
- Người đi làm
- Người sống một mình hoặc ở trọ
- Những người thường nấu ăn với nguyên liệu hạn chế và ít thời gian lên thực đơn

## ⚙️ Chức năng chính

| STT | Chức năng | Mô tả |
|---|---|---|
| 1 | Nhập nguyên liệu | Người dùng nhập 2–3 tên nguyên liệu vào ô tìm kiếm |
| 2 | Tìm kiếm món ăn | Gửi request đến API và nhận danh sách món ăn phù hợp |
| 3 | Hiển thị kết quả | Hiển thị danh sách món ăn bằng RecyclerView, gồm tên, hình ảnh và số nguyên liệu thiếu |
| 4 | Xem chi tiết món ăn | Hiển thị đầy đủ nguyên liệu và các bước thực hiện |
| 5 | Xử lý trạng thái | Hiển thị loading, thông báo khi không tìm thấy kết quả hoặc xảy ra lỗi mạng |

## 🛠️ Công nghệ sử dụng

- **Kotlin** – Ngôn ngữ lập trình
- **Android Studio** – Môi trường phát triển
- **XML Layout** – Thiết kế giao diện
- **ViewBinding** – Truy cập View an toàn kiểu dữ liệu
- **RecyclerView + Adapter** – Hiển thị danh sách món ăn
- **Retrofit** (hoặc thư viện networking tương đương) – Gọi RESTful API
- **JSON** – Định dạng dữ liệu trao đổi với API
- **Kotlin Data Class** – Mô hình hóa dữ liệu món ăn
- **Gradle (Kotlin DSL)** – Quản lý và xây dựng project

## 🔌 API

Dữ liệu món ăn được lấy từ **API bên thứ ba**, dự kiến sử dụng:

- Spoonacular API
- Edamam API

Ứng dụng không tự xây dựng cơ sở dữ liệu công thức mà lấy dữ liệu món ăn từ API.

## 📂 Phạm vi đề tài

Đề tài tập trung vào chức năng **tìm món ăn theo các nguyên liệu có sẵn**.

Ứng dụng không xây dựng thành một nền tảng nấu ăn đầy đủ và không bao gồm các chức năng như:

- Lưu công thức cá nhân
- Đánh giá món ăn
- Mạng xã hội

Giao diện sử dụng **XML Layout truyền thống**, không sử dụng Jetpack Compose.

## 👨‍💻 Nhóm thực hiện

**Môn:** Lập trình trên điện thoại di động  
**Lớp học phần:** 126LTTD03  
**Nhóm:** 07

| Thành viên | MSSV |
|---|---|
| Nguyễn Bá Phát | 2415053122228 |
| Trần Đức Tài | 2415053122241 |
| Phạm Nhật Khoa | 2415053122221 |

## 👨‍🏫 Giảng viên hướng dẫn

**ThS. Đỗ Phú Huy**

---

> 📌 **Đề tài: Cứu Hộ Tủ Lạnh – Leftover Recipe Finder**
>
> Ứng dụng giúp người dùng biến những nguyên liệu còn lại trong tủ lạnh thành những gợi ý món ăn phù hợp.
