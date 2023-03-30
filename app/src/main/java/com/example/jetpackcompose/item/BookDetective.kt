package com.example.jetpackcompose.item

import com.example.jetpackcompose.R


val book_detective = listOf(
    BookDetective("book8","Chuộc Tội", R.drawable.book8,"Minato Kanae",""),
    BookDetective("book9","Thú Tội", R.drawable.book9,"Minato Kanae",""),
    BookDetective("book10","Thiếu Nữ (Shoujo)", R.drawable.book10,"Minato Kanae",""),
    BookDetective("book11","Án Mạng Mười Một Chữ", R.drawable.book11,"Higashino Keigo",""),
    BookDetective("book12","Sherlock Holmes", R.drawable.book12,"Arthur Conan Doyle",""),
    BookDetective("book13","The Shining - Thị Kiến", R.drawable.book13,"Stephen King",""),
    BookDetective("book14","Án Tây Du", R.drawable.book14,"Trần Tiệm",""))

val book4=  BookDetective("book4","Harry Potter và chiếc cốc lửa", R.drawable.book4,"J.K Rowling", "Harry Potter, cùng gia đình Weasley, đi xem trận chung kết Quidditch thế giới lần thứ 422, " +
        "nơi diễn ra một hiện tượng kì bí làm mọi người đều run sợ, đó là sự xuất hiện của những kẻ hủy diệt thế giới. " +
        "Cậu đã mơ thấy một giấc mơ lạ trong ngôi nhà của Riddle với hai người chưa nhìn rõ mặt. " +
        "Rồi cậu bước vào năm thứ tư ở trường Hogwarts, với cuộc thi Tam Pháp Thuật đầy thử thách, " +
        "cùng với các nhà phù thủy thiếu niên tài năng trên thế giới.")

data class BookDetective (
    val id: String,
    val title: String,
    val cover: Int,
    val authors: String,
    val details: String
)