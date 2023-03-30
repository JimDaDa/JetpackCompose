package com.example.jetpackcompose.fragment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.funtion_books.ListItem
import com.example.jetpackcompose.item.BookItem
import com.example.jetpackcompose.ui.theme.font_heading

@Composable
fun Books(openBooksAction: () -> Unit, bookitems: List<BookItem>, openDetails: (String)-> Unit){

   Box(modifier = Modifier
       .fillMaxSize()
       .background(colorResource(id = R.color.background))) {


           Scaffold(topBar = {
               //Thanh top bar
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
                   backgroundColor = colorResource(id = R.color.background))

           }){
                   paddingValues ->
               Row(modifier = Modifier
                   .background(colorResource(id = R.color.background))
                   .padding(paddingValues)
               ) {
                   //List View
                   ListItem(openDetails =openDetails, bookitems = bookitems)
               }
           }

       }
   }






