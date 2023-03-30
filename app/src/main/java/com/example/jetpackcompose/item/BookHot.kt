package com.example.jetpackcompose.item

import com.example.jetpackcompose.R


val book_hot = listOf(
    BookHot("book15","Bạn Không Thông Minh Lắm Đâu", R.drawable.book15,"",""),
    BookHot( "book16","Bạn Đỡ Ngu Ngơ Rồi Đấy", R.drawable.book16,"",""),
    BookHot("book17","Chuyện con mèo lập kèo cứu sách", R.drawable.book17,"",""),
    BookHot("book18","IT - Gã Hề Ma Quái - Tập 1", R.drawable.book18,"",""),
    BookHot("book19","IT - Gã Hề Ma Quái - Tập 2", R.drawable.book19,"",""),
    BookHot("book20","Một Thoáng Ta Rực Rỡ Ở Nhân Gian", R.drawable.book20,"",""),
    BookHot("book21","Điều Kỳ Diệu Của Tiệm Tạp Hóa NAMIYA", R.drawable.book21,"",""))


data class BookHot (
    val id: String,
    val title: String,
    val cover: Int,
    val authors: String,
    val details: String
)

val book2 = BookHot("book2","Harry Potter và Phòng chứa bí mật", R.drawable.book2,"J.K Rowling","Dobby đã cảnh báo Harry về mối nguy hiểm chết người đang chờ cậu ở trường Hogwarts. " +
        "Và chính Dobby đã tìm mọi cách ngăn chặn Harry trở lại với thế giới phù thủy,… " +
        "Trong quá trình nói, Dobby đã gây ra rất nhiều tiếng ồn, khiến những người ở tầng một chú ý. " +
        "Thế nhưng, những gì mà Dobby nói đều là sự thật. Có một tin đồn đang lan truyền trong trường về phòng chứa bí mật của Slytherin," +
        " nơi cất giữ những bí ẩn đáng sợ dành cho giới phù thủy gốc Muggle. Có một lời cảnh báo kinh hoàng được tìm thấy trên bức tường. " +
        "Và chỉ có người kế vị của Slytherin mới mở được căn phòng đó. Thất vọng vì Harry không nghe lời khuyên của mình, " +
        "Dobby chạy xuống cầu thang, dùng một loại thần chú không rõ tên phá hủy chiếc bánh ngọt trong bữa tiệc dưới lầu rồi biến mất.")