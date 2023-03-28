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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.item.bookitems

@Composable
fun Books(openBooksAction: () -> Unit){
   Box(modifier = Modifier
       .fillMaxSize()
       .background(colorResource(id = R.color.background))) {

      //List View
       ListItem()
       }
   }

@Composable
fun ListItem(){

    Column(modifier = Modifier.fillMaxSize()) {
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
                            .fillMaxWidth())
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(text = book.title,fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.nau),
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center)

                }

            }
        }
    }
}
