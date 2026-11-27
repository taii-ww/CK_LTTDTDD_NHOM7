> **PHẦN A — BẤT BIẾN**  
> **BỐI CẢNH DỰ ÁN "CỨU HỘ TỦ LẠNH" (Leftover Recipe Finder)**
> 
> Phần này KHÔNG thay đổi khi code thay đổi.  
> Mọi thay đổi về hiện trạng code, feature status, test PASS/FAIL thuộc PHẦN B (cập nhật riêng).

---

## I. THÔNG TIN HÀNH CHÍNH

- **Tên dự án (VI)**     : Cứu Hộ Tủ Lạnh
- **Tên dự án (EN)**     : Leftover Recipe Finder
- **Môn học**            : Lập trình trên điện thoại di động
- **Lớp học phần**       : 126LTTD03
- **Nhóm**               : 07
- **Giảng viên HD**      : ThS. Đỗ Phú Huy
- **Trường**             : ĐH Sư phạm Kỹ thuật – ĐH Đà Nẵng
- **Khoa**               : Công nghệ số
- **Loại bài**           : Báo cáo bài tập lần 2
- **Thành viên**:
  - Nguyễn Bá Phát  – 2415053122228
  - Trần Đức Tài    – 2415053122241
  - Phạm Nhật Khoa  – 2415053122221

---

## II. BỐI CẢNH & VẤN ĐỀ NGHIỆP VỤ

### 2.1. BỐI CẢNH
Trong đời sống hằng ngày, đặc biệt với sinh viên, người đi làm, người sống một mình hoặc ở trọ, tủ lạnh thường có sẵn một số nguyên liệu lẻ (trứng, cà chua, hành, thịt còn dư, rau củ...) nhưng người dùng không biết kết hợp thế nào để nấu thành món.

Các ứng dụng nấu ăn hiện có trên thị trường thường đi theo chiều ngược: người dùng phải biết tên món trước, sau đó mới tra cứu nguyên liệu. Điều này không phù hợp với tình huống thực tế "có gì trong tủ thì nấu món đó".

### 2.2. VẤN ĐỀ CẦN GIẢI QUYẾT
- **(a)** Người dùng mất nhiều thời gian tìm công thức phù hợp với nguyên liệu sẵn có.
- **(b)** Nguyên liệu trong tủ không được theo dõi hạn sử dụng, dẫn đến hết hạn, phải bỏ — gây lãng phí thực phẩm và chi phí.
- **(c)** Người dùng phải mua thêm nguyên liệu không cần thiết vì không biết món nào có thể nấu từ những gì đang có.
- **(d)** Không có công cụ nào hỗ trợ nhập nguyên liệu nhanh (gõ tay hoặc quét camera) để tra ngược ra món ăn.

### 2.3. GIẢI PHÁP
Xây dựng ứng dụng Android "Cứu Hộ Tủ Lạnh" với 4 trụ cột:
1. Nhập nguyên liệu linh hoạt (gõ tay hoặc quét camera).
2. Gợi ý món ăn phù hợp với nguyên liệu đang có, kèm bộ lọc và sắp xếp theo nhu cầu.
3. Quản lý "tủ lạnh số" — theo dõi số lượng, hạn sử dụng, cảnh báo nguyên liệu sắp hết hạn.
4. Lưu món yêu thích để xem lại nhanh.

Toàn bộ giao diện tiếng Việt, thân thiện, thao tác một tay.

---

## III. MỤC TIÊU DỰ ÁN

### 3.1. MỤC TIÊU CHUNG
Xây dựng một ứng dụng Android giúp người dùng tận dụng tối đa nguyên liệu sẵn có trong tủ lạnh để nấu ăn, giảm lãng phí thực phẩm và tiết kiệm thời gian lên thực đơn.

### 3.2. MỤC TIÊU CỤ THỂ (SMART)
- **M1.** Cho phép người dùng nhập 2–3 nguyên liệu (bằng gõ tay hoặc quét camera) và nhận về danh sách món ăn khả thi.
- **M2.** Hiển thị kết quả trực quan: hình ảnh món, tên món, thời gian nấu, số nguyên liệu đã có / còn thiếu.
- **M3.** Cho phép lọc & sắp xếp kết quả theo "ít nguyên liệu thiếu nhất" và "nấu nhanh".
- **M4.** Cho phép xem chi tiết công thức: nguyên liệu đang có, nguyên liệu còn thiếu, các bước chế biến.
- **M5.** Quản lý tủ lạnh số: thêm / xem / sửa / xóa nguyên liệu, theo dõi hạn sử dụng, cảnh báo "nên dùng sớm".
- **M6.** Lưu / bỏ lưu món yêu thích.
- **M7.** Áp dụng đúng các kỹ thuật lập trình Android đã học: Fragment, RecyclerView + Adapter, ViewBinding, Extension Functions, Scope Functions, quản lý trạng thái UI (loading / empty / error / content), Activity Lifecycle.

---

## IV. ĐỐI TƯỢNG NGƯỜI DÙNG

### 4.1. NGƯỜI DÙNG CHÍNH
- Sinh viên, người đi làm.
- Người sống một mình / ở trọ.
- Nhóm người thường nấu ăn với nguyên liệu hạn chế và ít thời gian lên thực đơn.

### 4.2. ĐẶC ĐIỂM NGƯỜI DÙNG
- Thường dùng điện thoại một tay, tranh thủ thời gian rảnh.
- Không quen với giao diện phức tạp, cần thao tác nhanh, rõ ràng.
- Ưu tiên hình ảnh minh họa hơn đọc nhiều chữ.
- Cần thông tin ngắn gọn: tên món, thời gian, nguyên liệu, các bước nấu.

### 4.3. NHU CẦU CỐT LÕI
- "Tủ lạnh có gì → nấu được món gì?"
- "Món này cần nguyên liệu gì, tôi còn thiếu gì?"
- "Nguyên liệu nào sắp hỏng để tôi dùng trước?"
- "Lưu món ngon để lần sau nấu lại."

---

## V. PHẠM VI DỰ ÁN

### 5.1. TRONG PHẠM VI
- **IN-1.** Ứng dụng Android native, Kotlin + XML Layout truyền thống (KHÔNG dùng Jetpack Compose).
- **IN-2.** Nhập nguyên liệu bằng 2 cách: gõ tay và quét camera (chuyển sang màn hình camera để quét thay vì gõ).
- **IN-3.** Tìm món theo nguyên liệu (dự kiến gọi API bên thứ ba).
- **IN-4.** Bộ lọc / sắp xếp kết quả: "ít nguyên liệu thiếu nhất", "nấu nhanh".
- **IN-5.** Xem chi tiết công thức món ăn.
- **IN-6.** Quản lý tủ lạnh số: thêm / xem / sửa / xóa nguyên liệu, theo dõi hạn sử dụng.
- **IN-7.** Cảnh báo "nên dùng sớm" cho nguyên liệu sắp hết hạn.
- **IN-8.** Lưu / bỏ lưu món yêu thích.
- **IN-9.** Bottom Navigation 3 tab: Trang chủ / Tủ lạnh / Yêu thích.
- **IN-10.** Quản lý trạng thái UI: loading / empty / error / content.
- **IN-11.** Giao diện tiếng Việt, thao tác một tay, thân thiện.

### 5.2. NGOÀI PHẠM VI
- **OUT-1.** Không xây dựng ứng dụng nấu ăn đầy đủ (không có đánh giá món, mạng xã hội, chia sẻ công thức, livestream...).
- **OUT-2.** Không xây dựng cơ sở dữ liệu công thức riêng — dữ liệu món ăn lấy từ API bên thứ ba (Spoonacular hoặc Edamam).
- **OUT-3.** Không có tính năng lập kế hoạch bữa ăn theo tuần / tháng.
- **OUT-4.** Không có tính năng mua sắm / đặt hàng thực phẩm.
- **OUT-5.** Không hỗ trợ iOS / Web / Desktop.
- **OUT-6.** Không có tính năng đăng nhập / tài khoản người dùng (dữ liệu lưu cục bộ trên máy).
- **OUT-7.** Không có tính năng chia sẻ món ăn lên mạng xã hội.

---

## VI. THUẬT NGỮ & VIẾT TẮT

- **API**        : Application Programming Interface — giao diện lập trình
- **UI**         : User Interface — giao diện người dùng
- **UX**         : User Experience — trải nghiệm người dùng
- **Fragment**   : Thành phần UI có vòng đời riêng, gắn vào Activity
- **Activity**   : Thành phần Android đại diện một màn hình
- **Adapter**    : Lớp nối dữ liệu với RecyclerView
- **ViewBinding**: Cơ chế truy cập View an toàn kiểu dữ liệu
- **Scope Fn**   : `apply` / `let` / `run` / `with` / `also` — hàm phạm vi Kotlin
- **Extension**  : Hàm mở rộng (vd: `View.show()`)
- **State**      : Trạng thái hiển thị của màn (content/loading/empty/error)
- **Bundle**     : Đối tượng truyền dữ liệu giữa Fragment/Activity
- **Chip**       : Thành phần UI nhỏ dạng nhãn, có nút X để xóa
- **FAB**        : Floating Action Button — nút nổi
- **CSDL**       : Cơ sở dữ liệu
- **CRUD**       : Create – Read – Update – Delete
- **NL**         : Nguyên liệu (viết tắt trong tài liệu)
- **CT**         : Công thức (viết tắt trong tài liệu)
- **"Nên dùng sớm"**: nhãn cảnh báo NL sắp hết hạn

---

## VII. THỰC THỂ NGHIỆP VỤ (BUSINESS ENTITIES)

Mô tả ở mức NGHIỆP VỤ — độc lập với cách cài đặt (data class, Room entity, JSON...) trong code.

### 7.1. RECIPE — MÓN ĂN
**Ý nghĩa:** Một món ăn có thể gợi ý cho người dùng.

**Thuộc tính nghiệp vụ:**
- `id`                  : Mã định danh món ăn (duy nhất)
- `name`                : Tên món ăn
- `image`               : Hình ảnh minh họa món ăn
- `time`                : Thời gian nấu (phút)
- `ingredientEnough`    : Mô tả số NL người dùng đã có (vd: "Có 3 nguyên liệu")
- `ingredientMiss`      : Mô tả số NL còn thiếu (vd: "Thiếu 1")
- `[mở rộng] description`    : Mô tả ngắn về món ăn
- `[mở rộng] servings`       : Khẩu phần (số người)
- `[mở rộng] difficulty`     : Độ khó (Dễ / Trung bình / Khó)
- `[mở rộng] ingredientsHave`: Danh sách NL người dùng đã có (chi tiết)
- `[mở rộng] ingredientsMiss`: Danh sách NL còn thiếu (chi tiết)
- `[mở rộng] steps`          : Danh sách các bước chế biến

### 7.2. INGREDIENT — NGUYÊN LIỆU
**Ý nghĩa:** Một nguyên liệu người dùng lưu trong "tủ lạnh số".

**Thuộc tính nghiệp vụ:**
- `name`           : Tên nguyên liệu
- `quantity`       : Số lượng (số nguyên dương)
- `unit`           : Đơn vị (Quả, Gram, Kg, Lít, Hộp, Bó...)
- `expiry`         : Hạn sử dụng (ngày cụ thể) / mô tả còn bao lâu
- `shouldUseSoon`  : Cờ đánh dấu NL sắp hết hạn (xem quy tắc BR-08)
- `imageRes/image` : Hình ảnh / icon nguyên liệu
- `[mở rộng] category` : Danh mục (Rau củ / Thịt / Nước / Trứng / Trái cây / Cá / Đồ khô / Khác)
- `[mở rộng] note`     : Ghi chú bảo quản (tùy chọn)

### 7.3. UI STATE — TRẠNG THÁI HIỂN THỊ
**Ý nghĩa:** Trạng thái của một màn hình danh sách.  
**Giá trị:** `CONTENT` (có dữ liệu) / `LOADING` (đang tải) / `EMPTY` (rỗng) / `ERROR` (lỗi).

### 7.4. CATEGORY — DANH MỤC NGUYÊN LIỆU
**Ý nghĩa:** Phân loại nguyên liệu để lọc nhanh.  
**Giá trị cố định:** Rau củ, Thịt, Nước, Trứng, Trái cây, Cá, Đồ khô, Khác.

### 7.5. UNIT — ĐƠN VỊ ĐO
**Ý nghĩa:** Đơn vị đo số lượng nguyên liệu.  
**Giá trị cố định (tối thiểu):** Quả, Gram, Kg, Lít, Hộp, Bó.  
Có thể mở rộng khi cần.

### 7.6. FAVORITE — MÓN YÊU THÍCH
**Ý nghĩa:** Liên kết giữa người dùng và món ăn được lưu.  
**Thuộc tính:** `recipeId` (mã món), `savedAt` (thời điểm lưu - tùy chọn).

---

## VIII. DANH SÁCH MÀN HÌNH (BUSINESS-LEVEL)

Tổng cộng 6 màn hình chính:

| STT | Tên màn hình | Mục đích nghiệp vụ | Cách truy cập |
| :--- | :--- | :--- | :--- |
| 1 | Trang chủ | Nhập / quét nguyên liệu, tìm món, xem gợi ý hôm nay | Tab "Trang chủ" (mặc định khi mở) |
| 2 | Gợi ý tìm món ăn (Kết quả tìm kiếm) | Hiển thị danh sách món phù hợp với nguyên liệu đã nhập | Nút "Tìm món ăn" ở Trang chủ |
| 3 | Chi tiết công thức | Xem NL đang có / còn thiếu và các bước chế biến | Click 1 món ở Trang chủ / Kết quả / Yêu thích |
| 4 | Tủ lạnh của tôi | Quản lý danh sách nguyên liệu, theo dõi hạn sử dụng | Tab "Tủ lạnh" |
| 5 | Thêm nguyên liệu | Nhập thông tin một nguyên liệu mới | Nút "Thêm nguyên liệu" ở Tủ lạnh / link "+ Thêm NL vào tủ" ở Trang chủ |
| 6 | Món yêu thích | Xem lại các món đã lưu | Tab "Yêu thích" |

**Màn hình phụ / không bắt buộc (có thể có trong tương lai):**
- Màn hình camera để quét nguyên liệu (mở từ nút "Quét nguyên liệu").
- Màn hình chỉnh sửa nguyên liệu (mở từ item trong Tủ lạnh).

---

## IX. ĐẶC TẢ CHỨC NĂNG (FUNCTION SPECIFICATION)

Mỗi chức năng mô tả theo cấu trúc:  
`ID + Tên | Mục đích | Đầu vào | Xử lý nghiệp vụ | Đầu ra | Quy tắc áp dụng | Tiêu chí nghiệm thu (tóm tắt — chi tiết ở Phần XII).`

### NHÓM A. TÌM MÓN ĂN

#### F01. Nhập nguyên liệu thủ công trên Trang chủ
- **Mục đích:** Cho phép người dùng thêm nguyên liệu đang có vào danh sách tìm kiếm bằng cách gõ tay.
- **Đầu vào:** Chuỗi tên nguyên liệu người dùng gõ.
- **Xử lý:**
  - Người dùng nhập tên NL vào ô "Tìm nguyên liệu...".
  - Bấm nút "+" (hoặc phím Done) để xác nhận thêm.
  - Kiểm tra trùng lặp: nếu NL đã tồn tại (không phân biệt hoa/thường) → bỏ qua, không thêm mới.
  - Nếu hợp lệ → tạo một Chip hiển thị tên NL, có nút X để xóa.
  - Xóa trắng ô nhập sau khi thêm thành công.
  - Bấm X trên Chip → xóa NL khỏi danh sách.
- **Đầu ra:** Danh sách Chip nguyên liệu hiển thị trên Trang chủ.
- **Quy tắc:** BR-01 (chuỗi rỗng), BR-02 (chống trùng), BR-03 (xóa Chip).
- **Nghiệm thu:** TC-F01-01 → TC-F01-06.

#### F02. Quét nguyên liệu bằng camera
- **Mục đích:** Cho phép người dùng quét NL hiện có bằng camera thay vì gõ tay, tăng tốc độ nhập liệu.
- **Đầu vào:** Ảnh chụp từ camera.
- **Xử lý:**
  - Người dùng bấm nút "Quét nguyên liệu" trên Trang chủ.
  - Hệ thống xin quyền CAMERA (nếu chưa có) và mở màn hình camera (hoặc ứng dụng camera hệ thống).
  - Người dùng chụp ảnh NL.
  - Hệ thống nhận diện NL trong ảnh (hoặc để người dùng tự xác nhận kết quả nhận diện).
  - Kết quả nhận diện được thêm thành Chip nguyên liệu trên Trang chủ — hành vi giống hệt F01.
- **Đầu ra:** Chip NL mới được thêm vào danh sách trên Trang chủ.
- **Quy tắc:** BR-02 (chống trùng với NL đã có), BR-04 (quyền camera).
- **Nghiệm thu:** TC-F02-01 → TC-F02-05.

#### F03. Thêm nguyên liệu vào tủ từ Trang chủ
- **Mục đích:** Lối tắt từ Trang chủ sang màn Thêm nguyên liệu mới, phục vụ người dùng muốn lưu NL vào tủ lạnh số.
- **Đầu vào:** Thao tác bấm của người dùng.
- **Xử lý:** Bấm "+ Thêm nguyên liệu vào tủ" → mở màn hình Thêm nguyên liệu (F11).
- **Đầu ra:** Màn hình Thêm nguyên liệu được mở.
- **Quy tắc:** —
- **Nghiệm thu:** TC-F03-01, TC-F03-02.

#### F04. Tìm món ăn (chuyển sang màn Gợi ý)
- **Mục đích:** Chuyển danh sách NL đã nhập sang màn hình kết quả tìm món.
- **Đầu vào:** Danh sách Chip NL trên Trang chủ.
- **Xử lý:**
  - Người dùng bấm nút "Tìm món ăn".
  - Hệ thống gom tất cả Chip thành danh sách chuỗi.
  - Chuyển sang màn Gợi ý tìm món ăn, truyền kèm danh sách NL.
- **Đầu ra:** Màn Gợi ý tìm món ăn mở ra, hiển thị tóm tắt NL đã nhập.
- **Quy tắc:** BR-05 (tóm tắt NL hiển thị).
- **Nghiệm thu:** TC-F04-01 → TC-F04-03.

#### F05. Hiển thị danh sách món gợi ý
- **Mục đích:** Hiển thị các món ăn phù hợp với NL người dùng đã nhập.
- **Đầu vào:** Danh sách NL từ F04.
- **Xử lý:**
  - Dòng tóm tắt NL hiển thị theo quy tắc BR-05.
  - Hiển thị danh sách món dạng thẻ (RecyclerView).
  - Mỗi thẻ gồm: hình ảnh, tên món, thời gian nấu, trạng thái NL đủ, trạng thái NL thiếu, icon tim.
  - Click thẻ món → mở Chi tiết công thức (F07) kèm mã món.
- **Đầu ra:** Danh sách món hiển thị trực quan.
- **Quy tắc:** BR-06 (thẻ món có đủ thông tin), BR-05.
- **Nghiệm thu:** TC-F05-01 → TC-F05-04.

#### F06. Lọc & sắp xếp kết quả
- **Mục đích:** Giúp người dùng nhanh chóng tìm món phù hợp nhu cầu.
- **Đầu vào:** Danh sách món + thao tác bật/tắt bộ lọc.
- **Xử lý:**
  - Nút "Ít nguyên liệu nhất": sắp xếp món thiếu ít NL lên trước.
  - Nút "Nấu nhanh": chỉ giữ món có thời gian nấu ≤ 15 phút.
  - Hai nút bật/tắt độc lập; có thể bật đồng thời.
  - Mỗi lần thay đổi → danh sách cập nhật ngay.
  - Dòng đếm kết quả "Tìm thấy X món phù hợp" cập nhật theo.
- **Đầu ra:** Danh sách món đã lọc/sắp xếp + dòng đếm kết quả.
- **Quy tắc:** BR-07 (ngưỡng "nấu nhanh" = 15 phút), BR-09 (đếm kết quả).
- **Nghiệm thu:** TC-F06-01 → TC-F06-05.

#### F07. Xem chi tiết công thức
- **Mục đích:** Cho người dùng xem đầy đủ thông tin công thức để nấu.
- **Đầu vào:** Mã món ăn (id) được truyền từ màn trước.
- **Xử lý:**
  - Hiển thị: ảnh lớn, tên món, mô tả, thời gian – khẩu phần – độ khó, danh sách NL người dùng đã có, danh sách NL còn thiếu, các bước chế biến (đánh số).
  - Nút Back → quay về màn trước.
  - Icon tim → toggle yêu thích (F08).
- **Đầu ra:** Màn hình chi tiết công thức đầy đủ.
- **Quy tắc:** BR-06 (đủ khối thông tin), BR-10 (phân biệt NL đang có / còn thiếu).
- **Nghiệm thu:** TC-F07-01 → TC-F07-04.

#### F08. Toggle yêu thích món ăn
- **Mục đích:** Cho phép người dùng lưu / bỏ lưu món ăn vào danh sách yêu thích.
- **Đầu vào:** Mã món + thao tác bấm icon tim.
- **Xử lý:**
  - Nếu món CHƯA có trong yêu thích → thêm vào yêu thích.
  - Nếu món ĐÃ có trong yêu thích → bỏ khỏi yêu thích.
  - Icon tim phản ánh trạng thái (đã lưu / chưa lưu).
- **Đầu ra:** Danh sách yêu thích được cập nhật; icon tim đổi trạng thái.
- **Quy tắc:** BR-11 (toggle idempotent).
- **Nghiệm thu:** TC-F08-01 → TC-F08-04.

### NHÓM B. QUẢN LÝ TỦ LẠNH

#### F09. Xem danh sách tủ lạnh
- **Mục đích:** Hiển thị toàn bộ NL người dùng đã lưu trong tủ.
- **Đầu vào:** Dữ liệu NL đã lưu.
- **Xử lý:**
  - Hiển thị thẻ tổng quan: tổng số NL, số món "nên dùng sớm".
  - Hiển thị danh sách NL (mỗi item: icon, tên, SL + đơn vị, hạn sử dụng, nhãn "Nên dùng sớm" nếu có).
  - Chip danh mục để lọc (Tất cả + 8 danh mục).
  - Nút nổi "Thêm nguyên liệu" → mở F11.
- **Đầu ra:** Màn hình Tủ lạnh đầy đủ.
- **Quy tắc:** BR-08 (đánh dấu "nên dùng sớm"), BR-12 (sắp xếp mới nhất lên đầu).
- **Nghiệm thu:** TC-F09-01 → TC-F09-05.

#### F10. Lọc NL theo chip danh mục
- **Mục đích:** Lọc nhanh NL theo loại (Rau củ / Thịt / Cá / ...).
- **Đầu vào:** Thao tác chọn chip của người dùng.
- **Xử lý:**
  - Chọn 1 chip danh mục → chỉ hiển thị NL thuộc danh mục đó.
  - Chọn "Tất cả" → hiển thị toàn bộ.
  - Chỉ 1 chip được chọn tại một thời điểm.
- **Đầu ra:** Danh sách NL đã lọc.
- **Quy tắc:** BR-13 (single-selection).
- **Nghiệm thu:** TC-F10-01 → TC-F10-03.

#### F11. Thêm nguyên liệu mới
- **Mục đích:** Lưu một NL mới vào tủ lạnh số.
- **Đầu vào:** Tên NL, số lượng, đơn vị, ngày hết hạn, danh mục, ghi chú (tùy chọn).
- **Xử lý:**
  - Nhập tên NL (bắt buộc).
  - Nhập số lượng (bắt buộc, số nguyên dương).
  - Chọn đơn vị (dropdown).
  - Chọn ngày hết hạn qua DatePicker (bắt buộc).
  - Chọn danh mục (8 lựa chọn, highlight khi chọn).
  - Ghi chú bảo quản (tùy chọn).
  - Bấm "Lưu nguyên liệu" → validate → lưu → quay về Tủ lạnh.
  - NL mới xuất hiện ở đầu danh sách "Thêm gần đây".
- **Đầu ra:** NL được lưu; màn Tủ lạnh cập nhật.
- **Quy tắc:** BR-14 (validate dữ liệu), BR-15 (ngày hết hạn), BR-16 (số lượng), BR-12 (mới nhất lên đầu).
- **Nghiệm thu:** TC-F11-01 → TC-F11-08.

#### F12. Chỉnh sửa / xóa nguyên liệu
- **Mục đích:** Cho phép sửa hoặc xóa NL đã lưu.
- **Đầu vào:** NL được chọn + thao tác chỉnh sửa / xóa.
- **Xử lý:**
  - Bấm 1 NL trong Tủ lạnh → mở màn chỉnh sửa (form giống F11 nhưng prefill dữ liệu cũ).
  - Sửa thông tin → Lưu → cập nhật danh sách.
  - Xóa NL → xác nhận → xóa khỏi tủ.
- **Đầu ra:** NL được cập nhật / xóa khỏi tủ.
- **Quy tắc:** BR-14, BR-15, BR-16, BR-17 (xác nhận xóa).
- **Nghiệm thu:** TC-F12-01 → TC-F12-05.

#### F13. Cảnh báo nguyên liệu sắp hết hạn
- **Mục đích:** Nhắc người dùng dùng NL trước khi hỏng, giảm lãng phí.
- **Đầu vào:** Danh sách NL có ngày hết hạn.
- **Xử lý:**
  - Với mỗi NL, tính số ngày còn lại đến hạn sử dụng.
  - Nếu ≤ ngưỡng quy định (BR-08) → đánh dấu `shouldUseSoon = true`.
  - NL được đánh dấu hiển thị nhãn "Nên dùng sớm" (màu cam).
  - Thẻ tổng quan hiển thị đếm "X món nên dùng sớm".
- **Đầu ra:** Nhãn cảnh báo + đếm tổng quan chính xác.
- **Quy tắc:** BR-08 (ngưỡng ngày), BR-18 (màu nhãn).
- **Nghiệm thu:** TC-F13-01 → TC-F13-04.

### NHÓM C. YÊU THÍCH

#### F14. Xem danh sách món yêu thích
- **Mục đích:** Xem lại các món đã lưu.
- **Đầu vào:** Danh sách món đã lưu.
- **Xử lý:**
  - Hiển thị banner giới thiệu.
  - Hiển thị danh sách món đã lưu (thẻ có icon tim đỏ).
  - Click món → mở Chi tiết công thức (F07).
  - Nếu chưa có món nào → hiển thị trạng thái rỗng + hướng dẫn.
- **Đầu ra:** Màn hình Yêu thích đầy đủ.
- **Quy tắc:** BR-19 (trạng thái rỗng).
- **Nghiệm thu:** TC-F14-01 → TC-F14-04.

#### F15. Bỏ yêu thích từ màn Yêu thích
- **Mục đích:** Xóa nhanh món khỏi danh sách yêu thích.
- **Đầu vào:** Món + thao tác bấm tim đỏ.
- **Xử lý:** Bấm tim đỏ → xóa món khỏi danh sách yêu thích. (Tương đương F08 nhưng thực hiện tại màn Yêu thích.)
- **Đầu ra:** Món bị xóa khỏi danh sách Yêu thích.
- **Quy tắc:** BR-11 (toggle).
- **Nghiệm thu:** TC-F15-01, TC-F15-02.

### NHÓM D. TRẠNG THÁI UI & ĐIỀU HƯỚNG

#### F16. Quản lý trạng thái UI danh sách
- **Mục đích:** Hiển thị đúng trạng thái màn hình theo tình huống (có dữ liệu / đang tải / rỗng / lỗi).
- **Đầu vào:** Trạng thái do tầng xử lý dữ liệu trả về.
- **Xử lý:**
  - `CONTENT` → hiển thị danh sách.
  - `LOADING` → hiển thị vòng xoay / tiến trình.
  - `EMPTY`   → hiển thị thông báo "không có dữ liệu" + hướng dẫn.
  - `ERROR`   → hiển thị thông báo lỗi + nút "Thử lại".
  - Chỉ một trạng thái hiển thị tại một thời điểm.
- **Đầu ra:** Trạng thái hiển thị chính xác theo dữ liệu.
- **Quy tắc:** BR-20 (một trạng thái duy nhất tại một thời điểm).
- **Nghiệm thu:** TC-F16-01 → TC-F16-05.

#### F17. Bottom Navigation 3 tab
- **Mục đích:** Điều hướng nhanh giữa 3 khu vực chính.
- **Đầu vào:** Thao tác bấm tab.
- **Xử lý:**
  - 3 tab cố định: Trang chủ / Tủ lạnh / Yêu thích.
  - Tab đang chọn được làm nổi bật (icon + text + nền).
  - Chuyển tab → hiển thị Fragment tương ứng.
  - Tab mặc định khi mở app: Trang chủ.
- **Đầu ra:** Màn hình tương ứng hiển thị.
- **Quy tắc:** BR-21 (tab mặc định).
- **Nghiệm thu:** TC-F17-01 → TC-F17-03.

#### F18. Điều hướng Fragment & Back
- **Mục đích:** Đảm bảo luồng điều hướng rõ ràng, quay lại đúng màn.
- **Đầu vào:** Thao tác mở màn chi tiết / nút Back.
- **Xử lý:**
  - Mở màn chi tiết / thêm mới → lưu vào back stack.
  - Nút Back trên giao diện → quay về màn trước.
  - Phím Back hệ thống → hoạt động tương tự.
- **Đầu ra:** Luồng điều hướng đúng.
- **Quy tắc:** BR-22 (back stack).
- **Nghiệm thu:** TC-F18-01 → TC-F18-04.

---

## X. QUY TẮC NGHIỆP VỤ (BUSINESS RULES)

- **BR-01.** Không thêm Chip NL nếu tên rỗng hoặc chỉ toàn khoảng trắng.
- **BR-02.** Chống trùng NL: nếu tên NL đã tồn tại (không phân biệt hoa/thường) → bỏ qua, không thêm chip mới.
- **BR-03.** Chip NL phải có nút X để người dùng xóa; bấm X → xóa NL khỏi danh sách đang chọn.
- **BR-04.** Quyền CAMERA: trước khi mở camera phải kiểm tra và xin quyền; nếu người dùng từ chối → hiển thị thông báo và không mở camera.
- **BR-05.** Dòng tóm tắt NL hiển thị theo quy tắc:
  - 0 NL : "Với nguyên liệu trong tủ lạnh của bạn"
  - 1–3 NL: "Với A, B, C"
  - > 3 NL: "Với A, B, C,..."
- **BR-06.** Thẻ món ăn bắt buộc có: hình ảnh, tên, thời gian, trạng thái NL đủ, trạng thái NL thiếu.
- **BR-07.** Ngưỡng "nấu nhanh": món có thời gian nấu ≤ 15 phút.
- **BR-08.** Ngưỡng "nên dùng sớm": NL có hạn sử dụng còn ≤ 3 ngày (tính theo ngày hiện tại) → đánh dấu `shouldUseSoon = true`.
- **BR-09.** Dòng đếm kết quả phải khớp với số món thực tế hiển thị sau khi áp dụng bộ lọc.
- **BR-10.** Trong Chi tiết công thức phải phân biệt rõ:
  - "Nguyên liệu bạn đang có" (đánh dấu check xanh).
  - "Nguyên liệu còn thiếu" (đánh dấu cộng cam).
- **BR-11.** Toggle yêu thích là idempotent theo trạng thái:
  - Nếu chưa có trong danh sách yêu thích → thêm vào.
  - Nếu đã có → xóa khỏi.
  - Không bao giờ tạo bản ghi trùng.
- **BR-12.** Danh sách NL trong tủ sắp xếp mới nhất lên đầu ("Thêm gần đây").
- **BR-13.** Lọc chip danh mục: single-selection (chỉ 1 chip được chọn tại một thời điểm).
- **BR-14.** Validate khi thêm / sửa NL:
  - Tên NL : bắt buộc, không rỗng.
  - Số lượng: bắt buộc, số nguyên dương.
  - Ngày hết hạn: bắt buộc.
  - Danh mục: bắt buộc (có giá trị mặc định).
- **BR-15.** Ngày hết hạn khi thêm mới phải ≥ ngày hiện tại.
- **BR-16.** Số lượng NL phải > 0.
- **BR-17.** Xóa NL phải có bước xác nhận (tránh xóa nhầm).
- **BR-18.** Nhãn "Nên dùng sớm" hiển thị màu cam (nhấn mạnh).
- **BR-19.** Màn Yêu thích khi không có món nào phải hiển thị trạng thái rỗng kèm hướng dẫn "Bấm vào biểu tượng trái tim ở món ăn để lưu lại tại đây".
- **BR-20.** Mỗi màn danh sách chỉ hiển thị một trạng thái UI tại một thời điểm (content/loading/empty/error).
- **BR-21.** Tab mặc định khi mở ứng dụng: "Trang chủ".
- **BR-22.** Màn chi tiết / thêm mới phải được thêm vào back stack; nút Back (giao diện + phím cứng) phải quay về màn trước.

---

## XI. TRẠNG THÁI UI & XỬ LÝ LỖI (BUSINESS-LEVEL)

| Trạng thái | Khi nào xảy ra | Cách hiển thị |
| :--- | :--- | :--- |
| Loading | Đang tải dữ liệu món ăn | Biểu tượng tiến trình, ẩn list cũ |
| Không có kết quả | Không có món phù hợp | "Không tìm thấy món phù hợp" + gợi ý thử nguyên liệu khác |
| Lỗi mạng | Mất kết nối / API lỗi | Thông báo lỗi + nút "Thử lại" |
| Danh sách trống | Chưa có NL trong tủ / chưa có món yêu thích | Hướng dẫn thêm NL / khám phá món ăn |
| Dữ liệu không hợp lệ | Trống tên, SL ≤ 0, ngày < hôm nay | Thông báo nhắc nhập đúng và đủ thông tin |
| NL sắp hết hạn | Hạn sử dụng còn ≤ 3 ngày | Nhãn cam "Nên dùng sớm" |

---

## XII. NGHIỆM THU — ACCEPTANCE CRITERIA

Mỗi test case mô tả HÀNH VI MONG ĐỢI của hệ thống ở mức nghiệp vụ, KHÔNG phụ thuộc vào code hiện tại. Khi code thay đổi, test case vẫn giữ nguyên — chỉ kết quả chạy thực tế thay đổi (thuộc Phần B).

**Định dạng:** Given (bối cảnh) – When (hành động) – Then (kết quả).

### 12.1. NHÓM F01 — NHẬP NGUYÊN LIỆU THỦ CÔNG
- **TC-F01-01 | Thêm NL bằng nút "+"**
  - **Given:** Người dùng ở Trang chủ, ô nhập NL trống.
  - **When :** Gõ "Trứng" và bấm nút "+".
  - **Then :** Có 1 Chip "Trứng" xuất hiện; ô nhập trống lại.

- **TC-F01-02 | Thêm NL bằng phím Done**
  - **Given:** Người dùng ở Trang chủ, bàn phím đang mở.
  - **When :** Gõ "Cà chua" và bấm phím Done.
  - **Then :** Có 1 Chip "Cà chua"; ô nhập trống lại.

- **TC-F01-03 | Chống trùng lặp**
  - **Given:** Đã có Chip "Trứng".
  - **When :** Gõ "trứng" (chữ thường) và bấm "+".
  - **Then :** KHÔNG thêm Chip mới; vẫn chỉ có 1 Chip "Trứng".

- **TC-F01-04 | Chuỗi rỗng**
  - **Given:** Ô nhập trống.
  - **When :** Bấm "+".
  - **Then :** Không thêm Chip nào.

- **TC-F01-05 | Xóa Chip bằng nút X**
  - **Given:** Có Chip "Trứng".
  - **When :** Bấm X trên Chip.
  - **Then :** Chip biến mất khỏi danh sách.

- **TC-F01-06 | Thêm nhiều NL liên tiếp**
  - **Given:** Ô nhập trống.
  - **When :** Thêm lần lượt "Trứng", "Cà chua", "Hành".
  - **Then :** Có 3 Chip tương ứng, đúng thứ tự thêm vào.

### 12.2. NHÓM F02 — QUÉT NL BẰNG CAMERA
- **TC-F02-01 | Nút "Quét nguyên liệu" hiển thị đúng**
  - **Given:** Người dùng ở Trang chủ.
  - **Then :** Có nút "Quét nguyên liệu" với icon camera, dễ nhận biết.

- **TC-F02-02 | Bấm nút → mở camera**
  - **Given:** Người dùng ở Trang chủ.
  - **When :** Bấm "Quét nguyên liệu".
  - **Then :** Mở màn hình camera (sau khi xin quyền nếu cần).

- **TC-F02-03 | Xin quyền camera khi chưa có**
  - **Given:** Ứng dụng chưa được cấp quyền CAMERA.
  - **When :** Bấm "Quét nguyên liệu".
  - **Then :** Hệ thống hiển thị hộp thoại xin quyền CAMERA.
    - Nếu đồng ý → mở camera.
    - Nếu từ chối → không mở camera, hiển thị thông báo.

- **TC-F02-04 | Chụp ảnh và thêm NL từ kết quả quét**
  - **Given:** Đã mở camera.
  - **When :** Chụp ảnh và xác nhận kết quả nhận diện.
  - **Then :** NL được thêm thành Chip trên Trang chủ (giống F01).

- **TC-F02-05 | Chống trùng với NL đã có**
  - **Given:** Đã có Chip "Trứng".
  - **When :** Quét ra "Trứng".
  - **Then :** Không thêm Chip trùng; giữ nguyên danh sách.

### 12.3. NHÓM F03 — THÊM NL VÀO TỦ TỪ TRANG CHỦ
- **TC-F03-01 | Nút "+ Thêm NL vào tủ" hiển thị**
  - **Given:** Người dùng ở Trang chủ.
  - **Then :** Có link "+ Thêm nguyên liệu vào tủ" rõ ràng.

- **TC-F03-02 | Bấm nút → mở màn Thêm NL**
  - **Given:** Người dùng ở Trang chủ.
  - **When :** Bấm "+ Thêm nguyên liệu vào tủ".
  - **Then :** Mở màn hình Thêm nguyên liệu (F11).

### 12.4. NHÓM F04 — TÌM MÓN ĂN
- **TC-F04-01 | Chuyển màn với 3 NL**
  - **Given:** Có 3 Chip: Trứng, Cà chua, Hành.
  - **When :** Bấm "Tìm món ăn".
  - **Then :** Mở màn Gợi ý tìm món; dòng tóm tắt hiển thị "Với Trứng, Cà chua, Hành".

- **TC-F04-02 | Chuyển màn khi không có NL**
  - **Given:** Không có Chip nào.
  - **When :** Bấm "Tìm món ăn".
  - **Then :** Mở màn Gợi ý; dòng tóm tắt "Với nguyên liệu trong tủ lạnh của bạn".

- **TC-F04-03 | Chuyển màn khi có > 3 NL**
  - **Given:** Có 5 Chip.
  - **When :** Bấm "Tìm món ăn".
  - **Then :** Dòng tóm tắt "Với A, B, C,...".

### 12.5. NHÓM F05 — HIỂN THỊ DANH SÁCH MÓN
- **TC-F05-01 | Hiển thị danh sách món**
  - **Given:** Đang ở màn Gợi ý tìm món ăn.
  - **Then :** Có danh sách thẻ món; mỗi thẻ có ảnh, tên, thời gian, có NL đủ, thiếu NL.

- **TC-F05-02 | Click thẻ món → mở chi tiết**
  - **Given:** Đang ở màn Gợi ý.
  - **When :** Bấm vào 1 thẻ món bất kỳ.
  - **Then :** Mở màn Chi tiết công thức của món đó.

- **TC-F05-03 | Thẻ món hiển thị đủ thông tin bắt buộc (BR-06)**
  - **Then :** Mọi thẻ đều có: ảnh + tên + thời gian + "Có X NL" + "Thiếu Y".

- **TC-F05-04 | Không có kết quả → trạng thái rỗng**
  - **Given:** Không có món nào khớp với NL đã nhập.
  - **Then :** Hiển thị thông báo "Không tìm thấy món phù hợp" + gợi ý thử nguyên liệu khác.

### 12.6. NHÓM F06 — LỌC & SẮP XẾP
- **TC-F06-01 | Bật "Nấu nhanh"**
  - **When :** Bật chip "Nấu nhanh".
  - **Then :** Chỉ hiển thị món có thời gian nấu ≤ 15 phút.

- **TC-F06-02 | Bật "Ít nguyên liệu nhất"**
  - **When :** Bật chip "Ít nguyên liệu nhất".
  - **Then :** Sắp xếp món thiếu ít NL lên trước (Thiếu 1 → 2 → 3).

- **TC-F06-03 | Bật cả 2 chip**
  - **When :** Bật cả "Nấu nhanh" và "Ít NL nhất".
  - **Then :** Danh sách vừa lọc (≤ 15 phút) vừa sắp xếp (thiếu ít lên trước).

- **TC-F06-04 | Tắt cả 2 chip**
  - **When :** Tắt cả 2 chip.
  - **Then :** Hiển thị toàn bộ danh sách gốc (không lọc / sắp xếp).

- **TC-F06-05 | Dòng đếm kết quả khớp**
  - **When :** Bật / tắt bộ lọc.
  - **Then :** "Tìm thấy X món phù hợp" cập nhật khớp với số thẻ hiển thị.

### 12.7. NHÓM F07 — CHI TIẾT CÔNG THỨC
- **TC-F07-01 | Hiển thị đủ khối thông tin**
  - **Given:** Đang ở Chi tiết công thức của 1 món.
  - **Then :** Có đủ: ảnh, tên món, mô tả, thời gian, khẩu phần, độ khó, NL đang có, NL còn thiếu, các bước chế biến.

- **TC-F07-02 | Nội dung đúng theo món được chọn**
  - **Given:** Chọn món "Trứng xào cà chua".
  - **Then :** Màn chi tiết hiển thị đúng tên, đúng nguyên liệu, đúng các bước của món đó.

- **TC-F07-03 | Phân biệt NL đang có / còn thiếu (BR-10)**
  - **Then :** NL đang có → icon check xanh.  
    NL còn thiếu → icon cộng cam.

- **TC-F07-04 | Nút Back**
  - **When :** Bấm nút Back.
  - **Then :** Quay về màn trước (Kết quả / Trang chủ / Yêu thích).

### 12.8. NHÓM F08 — TOGGLE YÊU THÍCH
- **TC-F08-01 | Icon tim hiển thị**
  - **Then :** Mỗi thẻ món ở màn Kết quả / Yêu thích có icon tim phản ánh trạng thái.

- **TC-F08-02 | Bấm tim → thêm yêu thích**
  - **Given:** Món chưa có trong danh sách yêu thích.
  - **When :** Bấm icon tim.
  - **Then :** Món được thêm vào Yêu thích; icon chuyển sang trạng thái "đã lưu".

- **TC-F08-03 | Bấm tim lần 2 → bỏ yêu thích**
  - **Given:** Món đã có trong yêu thích.
  - **When :** Bấm icon tim.
  - **Then :** Món bị xóa khỏi Yêu thích; icon chuyển về "chưa lưu".

- **TC-F08-04 | Không tạo trùng**
  - **When :** Bấm tim nhiều lần liên tiếp.
  - **Then :** Không bao giờ có 2 bản ghi trùng cho cùng 1 món.

### 12.9. NHÓM F09 — TỦ LẠNH
- **TC-F09-01 | Thẻ tổng quan**
  - **Given:** Đang ở tab Tủ lạnh.
  - **Then :** Có thẻ tổng quan: tổng số NL + số món "nên dùng sớm".

- **TC-F09-02 | Danh sách NL**
  - **Then :** Mỗi item có icon, tên, SL + đơn vị, hạn sử dụng.

- **TC-F09-03 | Nhãn "Nên dùng sớm"**
  - **Given:** 2 NL có hạn sử dụng ≤ 3 ngày.
  - **Then :** 2 NL đó hiển thị nhãn "Nên dùng sớm" màu cam.

- **TC-F09-04 | Nút "Thêm nguyên liệu"**
  - **When :** Bấm nút nổi "Thêm nguyên liệu".
  - **Then :** Mở màn Thêm nguyên liệu (F11).

- **TC-F09-05 | Sắp xếp mới nhất lên đầu (BR-12)**
  - **When :** Thêm NL mới.
  - **Then :** NL mới xuất hiện ở đầu danh sách.

### 12.10. NHÓM F10 — LỌC CHIP DANH MỤC
- **TC-F10-01 | Chọn chip "Rau củ"**
  - **Given:** Có NL thuộc nhiều danh mục.
  - **When :** Chọn chip "Rau củ".
  - **Then :** Chỉ hiển thị NL thuộc danh mục Rau củ.

- **TC-F10-02 | Chọn "Tất cả"**
  - **When :** Chọn chip "Tất cả".
  - **Then :** Hiển thị toàn bộ NL.

- **TC-F10-03 | Single-selection (BR-13)**
  - **When :** Chọn "Rau củ" rồi chọn "Thịt".
  - **Then :** Chỉ "Thịt" được chọn (Rau củ tự bỏ chọn).

### 12.11. NHÓM F11 — THÊM NL MỚI
- **TC-F11-01 | Validate trống tên**
  - **When :** Bỏ trống tên NL và bấm Lưu.
  - **Then :** Hiển thị thông báo nhập đầy đủ thông tin; KHÔNG lưu.

- **TC-F11-02 | Validate trống số lượng**
  - **When :** Bỏ trống SL và bấm Lưu.
  - **Then :** Thông báo nhập đầy đủ; KHÔNG lưu.

- **TC-F11-03 | Validate trống ngày hết hạn**
  - **When :** Bỏ trống ngày hết hạn và bấm Lưu.
  - **Then :** Thông báo nhập đầy đủ; KHÔNG lưu.

- **TC-F11-04 | Nhập đầy đủ → lưu thành công**
  - **When :** Nhập đủ tên + SL + ngày, bấm Lưu.
  - **Then :** NL được lưu; hiển thị thông báo "Đã thêm NL"; quay về Tủ lạnh.

- **TC-F11-05 | NL mới xuất hiện trong tủ**
  - **When :** Vừa thêm "Cà rốt".
  - **Then :** Tủ lạnh có "Cà rốt" ở đầu danh sách "Thêm gần đây".

- **TC-F11-06 | Chọn ngày qua DatePicker**
  - **When :** Bấm ô ngày hết hạn, chọn ngày.
  - **Then :** Ô hiển thị đúng ngày đã chọn (định dạng `dd/MM/yyyy`).

- **TC-F11-07 | Chọn danh mục highlight**
  - **When :** Bấm "Thịt".
  - **Then :** Nút "Thịt" được làm nổi bật; các nút khác trở về bình thường.

- **TC-F11-08 | Ngày hết hạn < hôm nay (BR-15)**
  - **When :** Chọn ngày trong quá khứ.
  - **Then :** Hiển thị thông báo không hợp lệ; KHÔNG lưu.

### 12.12. NHÓM F12 — CHỈNH SỬA / XÓA NL
- **TC-F12-01 | Mở form chỉnh sửa**
  - **Given:** Đang ở Tủ lạnh.
  - **When :** Bấm 1 NL bất kỳ.
  - **Then :** Mở form chỉnh sửa với dữ liệu cũ được điền sẵn.

- **TC-F12-02 | Lưu sau khi sửa**
  - **When :** Sửa SL từ 3 → 5, bấm Lưu.
  - **Then :** NL trong tủ cập nhật SL = 5.

- **TC-F12-03 | Xác nhận trước khi xóa (BR-17)**
  - **When :** Bấm xóa NL.
  - **Then :** Hiển thị hộp thoại xác nhận; chỉ xóa khi đồng ý.

- **TC-F12-04 | Xóa NL**
  - **When :** Xác nhận xóa.
  - **Then :** NL biến mất khỏi danh sách tủ.

- **TC-F12-05 | Hủy xóa**
  - **When :** Bấm hủy ở hộp thoại xác nhận.
  - **Then :** NL giữ nguyên trong tủ.

### 12.13. NHÓM F13 — CẢNH BÁO SẮP HẾT HẠN
- **TC-F13-01 | NL còn 3 ngày → nhãn "Nên dùng sớm"**
  - **Given:** NL có hạn sử dụng còn 3 ngày.
  - **Then :** NL đó hiển thị nhãn "Nên dùng sớm" màu cam.

- **TC-F13-02 | NL còn 7 ngày → không nhãn**
  - **Given:** NL có hạn sử dụng còn 7 ngày.
  - **Then :** NL đó KHÔNG hiển thị nhãn "Nên dùng sớm".

- **TC-F13-03 | Đếm tổng quan khớp**
  - **Given:** Có 2 NL "nên dùng sớm".
  - **Then :** Thẻ tổng quan hiển thị "2 món nên dùng sớm".

- **TC-F13-04 | Đã hết hạn**
  - **Given:** NL đã quá hạn.
  - **Then :** Vẫn hiển thị nhãn "Nên dùng sớm" (mức cảnh báo cao nhất).

### 12.14. NHÓM F14 — YÊU THÍCH
- **TC-F14-01 | Banner giới thiệu**
  - **Given:** Đang ở tab Yêu thích.
  - **Then :** Có banner giới thiệu + mô tả.

- **TC-F14-02 | Danh sách món yêu thích**
  - **Given:** Có ≥ 1 món đã lưu.
  - **Then :** Hiển thị danh sách món với icon tim đỏ.

- **TC-F14-03 | Trạng thái rỗng (BR-19)**
  - **Given:** Chưa có món nào được lưu.
  - **Then :** Hiển thị "Chưa có món yêu thích" + hướng dẫn bấm tim để lưu.

- **TC-F14-04 | Click món → mở chi tiết**
  - **When :** Bấm 1 món trong Yêu thích.
  - **Then :** Mở màn Chi tiết công thức của món đó.

### 12.15. NHÓM F15 — BỎ YÊU THÍCH
- **TC-F15-01 | Bấm tim đỏ → xóa khỏi yêu thích**
  - **Given:** Có món trong Yêu thích.
  - **When :** Bấm icon tim đỏ.
  - **Then :** Món bị xóa khỏi danh sách Yêu thích.

- **TC-F15-02 | Nếu danh sách trống sau khi xóa**
  - **Given:** Chỉ còn 1 món trong Yêu thích.
  - **When :** Bấm bỏ yêu thích món đó.
  - **Then :** Danh sách trống → hiển thị trạng thái rỗng (BR-19).

### 12.16. NHÓM F16 — TRẠNG THÁI UI
- **TC-F16-01 | CONTENT**
  - **Given:** Có dữ liệu.
  - **Then :** Hiển thị danh sách; không hiển thị loading/empty/error.

- **TC-F16-02 | LOADING**
  - **Given:** Đang tải dữ liệu.
  - **Then :** Chỉ hiển thị loading; ẩn danh sách.

- **TC-F16-03 | EMPTY**
  - **Given:** Không có dữ liệu.
  - **Then :** Chỉ hiển thị trạng thái rỗng + text hướng dẫn.

- **TC-F16-04 | ERROR**
  - **Given:** Xảy ra lỗi khi tải dữ liệu.
  - **Then :** Hiển thị thông báo lỗi + nút "Thử lại".

- **TC-F16-05 | Nút "Thử lại" hoạt động**
  - **Given:** Đang ở trạng thái ERROR.
  - **When :** Bấm "Thử lại".
  - **Then :** Hệ thống thực hiện lại thao tác tải dữ liệu (chuyển sang LOADING rồi CONTENT/EMPTY/ERROR tùy kết quả).

### 12.17. NHÓM F17 — BOTTOM NAVIGATION
- **TC-F17-01 | Chuyển tab**
  - **When :** Bấm tab "Tủ lạnh".
  - **Then :** Mở màn Tủ lạnh; tab "Tủ lạnh" được làm nổi bật.

- **TC-F17-02 | Tab mặc định (BR-21)**
  - **Given:** Mở ứng dụng lần đầu.
  - **Then :** Tab "Trang chủ" được chọn, hiển thị màn Trang chủ.

- **TC-F17-03 | 3 tab cố định**
  - **Then :** Bottom Navigation có đúng 3 tab: Trang chủ, Tủ lạnh, Yêu thích.

### 12.18. NHÓM F18 — ĐIỀU HƯỚNG & BACK
- **TC-F18-01 | Back từ Chi tiết**
  - **Given:** Đang ở Chi tiết công thức (mở từ Kết quả).
  - **When :** Bấm Back.
  - **Then :** Quay về màn Kết quả.

- **TC-F18-02 | Back từ Thêm NL**
  - **Given:** Đang ở Thêm nguyên liệu.
  - **When :** Bấm Back.
  - **Then :** Quay về Tủ lạnh.

- **TC-F18-03 | Back từ Gợi ý tìm món**
  - **Given:** Đang ở Gợi ý tìm món.
  - **When :** Bấm Back.
  - **Then :** Quay về Trang chủ.

- **TC-F18-04 | Phím Back hệ thống**
  - **Given:** Đang ở màn chi tiết bất kỳ.
  - **When :** Bấm phím Back cứng của điện thoại.
  - **Then :** Hoạt động giống nút Back trên giao diện.

---

## XIII. QUY ƯỚC (CONVENTIONS)

### 13.1. NGÔN NGỮ & ĐẶT TÊN
- **Code (biến, hàm, lớp):** tiếng Anh.
- **Text UI hiển thị**    : tiếng Việt.
- **Comment code**        : tiếng Việt, ngắn gọn, giải thích logic.
- **View id**             : camelCase + tiền tố loại:
  `tv…` (TextView), `et…` (EditText), `iv…` (ImageView), `btn…` (Button/ImageButton), `card…` (MaterialCardView), `rv…` (RecyclerView), `chip…`/`chipGroup…` (Chip/ChipGroup), `layout…` (container), `auto…` (AutoCompleteTextView), `tv…Title` / `tv…Message` (text động).
- **Resource**            : snake_case.  
  vd: `green_dark`, `bg_circle_white`, `ic_heart_red`, `img_food`
- **Package**             : `com.ute.cuuhotulanh`
- **Fragment**            : `<ScreenName>Fragment`
- **Adapter**             : `<Entity>Adapter`
- **Data class**          : PascalCase (`Recipe`, `Ingredient`)
- **Hằng số**             : `UPPER_SNAKE_CASE`
- **Extension Functions** : đặt trong `util/Extensions.kt`

### 13.2. QUY ƯỚC CODE
- Ưu tiên ViewBinding cho code mới, tránh `findViewById`.
- Khi gọi API bất đồng bộ: kiểm tra lifecycle (`view != null`, `isAdded`) trước khi cập nhật UI.
- Tách logic xử lý dữ liệu khỏi UI (Fragment chỉ bind + điều hướng).
- Adapter chỉ bind dữ liệu, không chứa business logic.
- Dùng Extension Functions (`show`/`gone`/`toast`) để rút gọn code.
- Dùng Scope Functions (`apply`/`let`/`run`/`with`/`also`) khi cấu hình View hoặc xử lý null-safe.
- Dùng StateLayout cho mọi màn danh sách (`loading`/`empty`/`error`).
- Comment cho mọi hàm public không tự giải thích được tên.

### 13.3. QUY ƯỚC GIAO DIỆN (DESIGN SYSTEM)
**Màu sắc:**
- `green_dark`     : xanh lá đậm — màu chủ đạo, text nhấn, icon
- `green_light`    : xanh lá nhạt — nền button, background nhấn
- `cream_bg`       : nền kem nhạt — background tổng thể
- `gray_dark`      : text chính
- `gray_light`     : viền input, stroke
- `text_secondary` : text phụ
- `orange`         : nhấn "Thiếu NL" / "Nên dùng sớm"
- `divider_light`  : đường phân cách
- `white`, `dark`  : cơ bản

**Typography:**
- Title lớn  : 24–28sp, bold
- Section    : 16–18sp, bold / sans-serif-medium
- Body       : 13–14sp
- Label nhỏ  : 10–12sp, letterSpacing 0.04

**Bố cục:**
- Thẻ bo góc 12–28dp
- Padding 16–24dp
- Icon vector 20–48dp
- Bottom Navigation cố định 3 tab
- Thao tác một tay (nút quan trọng ở dưới / phải)

**Nguyên tắc UX:**
- Đơn giản, thân thiện, gần gũi không gian bếp.
- Xưng hô gần gũi: "Hôm nay ăn gì?", "Cho chúng tôi biết trong tủ lạnh có gì".
- Ưu tiên hình ảnh minh họa hơn chữ.
- Phản hồi ngay khi thao tác (Toast, đổi màu, chip).

### 13.4. QUY ƯỚC KỸ THUẬT
- **Kiến trúc:** Single-Activity + Multi-Fragment.
- **Ngôn ngữ:** Kotlin, XML Layout (KHÔNG dùng Jetpack Compose).
- **Networking:** Retrofit hoặc tương đương (khi có API).
- **Lưu trữ cục bộ:** SharedPreferences / Room / DataStore (tùy giai đoạn).
- **API món ăn:** Spoonacular hoặc Edamam.
- **Camera:** `MediaStore.ACTION_IMAGE_CAPTURE` hoặc CameraX + ML Kit / Vision API để nhận diện NL (khi triển khai F02).
- **Xử lý ảnh:** Glide / Coil (khi ảnh từ URL).

---

## XIV. TÀI LIỆU THAM CHIẾU

- **Báo cáo bài tập lần 2 (.docx):** `NHÓM 7 - 126LTTD03.docx`
- **Figma design:** (link trong báo cáo gốc)
- **Spoonacular Food API:** https://spoonacular.com/food-api
- **Edamam Recipe API:** https://developer.edamam.com/edamam-recipe-api
- **Android Fragment docs:** https://developer.android.com/guide/fragments
- **Android Camera basics:** https://developer.android.com/training/camera/photobasics
- **Android Room:** https://developer.android.com/training/data-storage/room
- **Retrofit:** https://developer.android.com/training/dependency-injection/retrofit

---

## XV. TÓM TẮT NHANH (TL;DR) — PHẦN A

- **Dự án:** App Android "Cứu Hộ Tủ Lạnh" giúp tìm món từ NL sẵn có.
- **Kiến trúc:** Single-Activity + Multi-Fragment, Kotlin + XML.
- **6 màn hình chính**, 3 tab Bottom Navigation.
- **18 chức năng (F01–F18)** nhóm thành 4 nhóm:
  - A. Tìm món ăn (F01–F08)
  - B. Quản lý tủ lạnh (F09–F13)
  - C. Yêu thích (F14–F15)
  - D. Trạng thái UI & điều hướng (F16–F18)
- **22 quy tắc nghiệp vụ (BR-01 → BR-22).**
- **Bộ nghiệm thu:** ~75 test case (`TC-*`) phủ toàn bộ 18 chức năng, mô tả hành vi mong đợi ở mức nghiệp vụ — độc lập với code.
- **Quy ước:** naming, design system, technical stack.

---

**HẾT PHẦN A**