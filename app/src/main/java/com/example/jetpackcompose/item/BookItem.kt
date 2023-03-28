package com.example.jetpackcompose.item

import com.example.jetpackcompose.R

val bookitems= listOf(
    BookItem("Harry Potter và Hòn đá Phù Thủy", R.drawable.book1),
    BookItem( "Harry Potter và Phòng chứa bí mật", R.drawable.book2),
    BookItem("Harry Potter và tên tù nhân ngục Azkaban", R.drawable.book3),
    BookItem("Harry Potter và chiếc cốc lửa", R.drawable.book4),
    BookItem("Harry Potter và hội phượng hoàng", R.drawable.book5),
    BookItem("Harry Potter và hoàng tử lai", R.drawable.book6),
    BookItem("Harry Potter và bảo bối tử thần", R.drawable.book7)
)

val book_detective = listOf(
    BookItem_2(BookItem("Chuộc Tội", R.drawable.book8),"Minato Kanae"),
    BookItem_2(BookItem("Thú Tội", R.drawable.book9),"Minato Kanae"),
    BookItem_2(BookItem("Thiếu Nữ (Shoujo)", R.drawable.book10),"Minato Kanae"),
    BookItem_2(BookItem("Án Mạng Mười Một Chữ", R.drawable.book11),"Higashino Keigo"),
    BookItem_2(BookItem("Sherlock Holmes", R.drawable.book12),"Arthur Conan Doyle"),
    BookItem_2(BookItem("The Shining - Thị Kiến", R.drawable.book13),"Stephen King"),
    BookItem_2(BookItem("Án Tây Du", R.drawable.book14),"Trần Tiệm"),

//    BookItem_2("Chuộc Tội", R.drawable.book8),"Minato Kanae"),
//    BookItem_2("Thú Tội", R.drawable.book9,"Minato Kanae"),
//    BookItem_2("Thiếu Nữ (Shoujo)", R.drawable.book10,"Minato Kanae"),
//    BookItem_2("Án Mạng Mười Một Chữ", R.drawable.book11,"Higashino Keigo"),
//    BookItem_2("Sherlock Holmes", R.drawable.book12, "Arthur Conan Doyle"),
//    BookItem_2("The Shining - Thị Kiến", R.drawable.book13,"Stephen King"),
//    BookItem_2("Án Tây Du", R.drawable.book14,"Trần Tiệm")

)




data class BookItem (
    val title: String,
    val cover: Int
 )

data class BookItem_2 (
    val book: BookItem,
    val authors: String

)