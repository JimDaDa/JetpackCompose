package com.example.jetpackcompose.item


import com.example.jetpackcompose.R

val book_fiction = listOf(
    BookFiction("book22","Percy Jackson và Kẻ Cắp Tia Chớp", R.drawable.book22,"",""),
    BookFiction( "book23","Percy Jackson và Biển Quái Vật", R.drawable.book23,"",""),
    BookFiction("book24","Hoàng Tử Bé", R.drawable.book24,"",""),
    BookFiction("book25","Nhà Giả Kim", R.drawable.book25,"",""),
    BookFiction("book26","Tôi Không Thích Ồn Ào", R.drawable.book26,"",""),
    BookFiction("book27","Sữa Và Mật", R.drawable.book27,"",""),
    BookFiction("book28","Xuân Hạ Thu Đông ", R.drawable.book28,"",""))

val book3=  BookFiction("book3","Harry Potter và tên tù nhân ngục Azkaban", R.drawable.book3,"J.K Rowling","Harry Potter là một thằng bé không bình thường về nhiều phương diện . " +
        "Một trong những điểm không bình thường đó là nó rất ghét mùa hè, ghét hơn bất cứ quãng thời gian nào khác trong năm. " +
        "Một điều bất thường khác nữa là nó rất muốn làm bài tập, nhưng lại phải làm bài trong bí mật, vào giữa đêm hôm khuya khoắt . " +
        "Và cuối cùng, chỉ vì ngẫu nhiên mà nó trở thành phù thủy .")

data class BookFiction (
    val id: String,
    val title: String,
    val cover: Int,
    val authors: String,
    val details: String
)