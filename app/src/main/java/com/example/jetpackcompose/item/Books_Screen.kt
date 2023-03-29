package com.example.jetpackcompose.item

data class Books_Screen (
    val trending_book: List<BookItem>,
    val book_detective:List<BookItem>,
    val book_hot:List<BookItem>,
    val book_fiction:List<BookItem>)
{
    val all_screen: List<BookItem> = trending_book + book_detective + book_hot + book_fiction
}