package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.funtion_books.ListItem
import com.example.jetpackcompose.item.BookItem
import com.example.jetpackcompose.item.bookitems
import com.example.jetpackcompose.ui.theme.font_heading
import com.example.jetpackcompose.ui.theme.font_title

@Composable
fun Books(openBooksAction: () -> Unit, bookitems: List<BookItem>, openDetails: (String)-> Unit){

   Box(modifier = Modifier
       .fillMaxSize()
       .background(colorResource(id = R.color.background))) {
       TopAppBar(title = {
           Text(
               text = "Library",
               fontFamily = font_heading,
               fontWeight = FontWeight.Bold,
               color = colorResource(id = R.color.nau),
               fontSize = 20.sp,
               modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
           )
       },

           elevation = 0.dp,
           backgroundColor = Color.Transparent)
       

      //List View
       ListItem(openDetails =openDetails, bookitems = bookitems)
       }
   }






