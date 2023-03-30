package com.example.jetpackcompose.funtion_books

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.font_title
import com.example.jetpackcompose.R
import com.example.jetpackcompose.item.BookItem

//Hàm danh sách của thư viện => file Books
@Composable
fun ListItem(bookitems: List<BookItem>, openDetails: (String)-> Unit){

    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(15.dp))
        LazyVerticalGrid(columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(28.dp) ){

            items(bookitems){
                    book ->

                Column(Modifier.width(150.dp)) {

                    Image(painter = painterResource(id = book.cover),
                        contentDescription ="Book Cover",
                        modifier = Modifier
                            .padding(15.dp)
                            .aspectRatio(1f)
                            .fillMaxWidth()
                            .clickable(enabled = true, onClick = { openDetails(book.id) }),)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = book.title,fontFamily = font_title,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.nau),
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center)

                }

            }
        }
    }
}