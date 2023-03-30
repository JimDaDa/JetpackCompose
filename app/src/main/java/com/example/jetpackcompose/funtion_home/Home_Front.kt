package com.example.jetpackcompose.funtion_home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.BottomBar
import com.example.jetpackcompose.item.book_detective
import com.example.jetpackcompose.R
import com.example.jetpackcompose.funtion_books.ListItem
import com.example.jetpackcompose.navbar.BottomNavGraph
import com.example.jetpackcompose.ui.theme.font_heading
import com.example.jetpackcompose.ui.theme.font_title

//Phần sheet bottom
@Composable
fun Text_Front(){
    Text(
        text = "Trending",
        fontFamily = font_title,
        fontWeight = FontWeight.Bold,
        color = colorResource(id = R.color.nau),
        fontSize = 20.sp,
        modifier = Modifier.padding(horizontal = 10.dp)
    )
}
@Composable
fun Home_front() {
    Spacer(modifier = Modifier.height(20.dp))
    //Text_Front()
    Scaffold(topBar = {
        //Thanh top bar
        TopAppBar(
            title = {
                Text_Front()
            },

            elevation = 0.dp,
            backgroundColor = colorResource(id = R.color.background)
        )

    }) { paddingValues ->
        Row(
            modifier = Modifier
                .background(colorResource(id = R.color.background))
                .padding(paddingValues)
        ) {
            Spacer(modifier = Modifier.height(20.dp))
            //List truyện theo chiều dọc
            LazyColumn(contentPadding = PaddingValues(vertical = 16.dp)) {

                items(book_detective) { book ->

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 28.dp, vertical = 8.dp)
                            .height(120.dp),
                        horizontalArrangement = Arrangement.spacedBy(16.dp)
                    ) {

                        Image(
                            painter = painterResource(id = book.cover),
                            contentDescription = "Book Cover",
                            modifier = Modifier
                                .padding(15.dp)
                                .aspectRatio(1f)
                                .fillMaxHeight(), contentScale = ContentScale.FillHeight
                        )
                        Column(Modifier.weight(1f)) {
                            Text(
                                text = book.title, fontFamily = font_title,
                                fontWeight = FontWeight.Bold,
                                color = colorResource(id = R.color.nau),
                                fontSize = 16.sp,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.padding(vertical = 20.dp)

                            )
                            Text(
                                text = book.authors, fontFamily = font_title,
                                fontWeight = FontWeight.Light,
                                color = colorResource(id = R.color.nau),
                                fontSize = 13.sp,
                                textAlign = TextAlign.Center
                            )
                            Spacer(modifier = Modifier.weight(1f))
                        }
                    }

                }
            }
        }
    }
}


