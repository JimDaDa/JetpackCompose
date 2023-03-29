package com.example.jetpackcompose.funtion_home


import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.Book_Details
import com.example.jetpackcompose.item.bookitems
import com.example.jetpackcompose.R
import com.example.jetpackcompose.item.BookItem
import com.example.jetpackcompose.item.book_fiction
import com.example.jetpackcompose.item.book_hot
import com.example.jetpackcompose.navbar.Books
import com.example.jetpackcompose.ui.theme.font_heading
import com.example.jetpackcompose.ui.theme.font_title

//Hàm của màn hình chính
@Composable
fun Text_Back(){
   Row(
       Modifier
           .fillMaxWidth()
           .padding(horizontal = 15.dp), verticalAlignment = Alignment.CenterVertically) {

       Text(
           text = "My books",
           fontFamily = font_heading,
           fontWeight = FontWeight.Bold,
           color = colorResource(
               id = R.color.nau
           ),
           fontSize = 20.sp,
           modifier = Modifier.padding(horizontal = 5.dp, vertical = 10.dp)
       )

       TextButton(onClick = { /*TODO*/ }) {
           Text(text = "View more")
           Spacer(modifier = Modifier.width(4.dp))
           Icon(imageVector = Icons.Filled.ArrowForward, contentDescription = "View more" )
       }
   }


}

@Composable
fun Text_Back_hot() {
    Text(
        text = "Hot",
        fontFamily = font_heading,
        fontWeight = FontWeight.Bold,
        color = colorResource(
            id = R.color.nau
        ),
        fontSize = 20.sp,
        modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
    )
}

@Composable
fun Text_Back_fiction() {
    Text(
        text = "Fiction",
        fontFamily = font_heading,
        fontWeight = FontWeight.Bold,
        color = colorResource(
            id = R.color.nau
        ),
        fontSize = 20.sp,
        modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
    )
}

//Màn hình home
@Composable
fun Home_back(bookit: List<BookItem>, openDetails: (String)-> Unit){
    Column() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 28.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text_Back()
        }
    }


    LazyRow(
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        items(bookit) { booki ->

            Column(Modifier.width(150.dp)) {

                Cover(booki=booki,openDetails=openDetails)
                Title(booki = booki)
                Spacer(modifier = Modifier.height(8.dp))

            }

        }


    }
}

@Composable
fun Cover(booki: BookItem, openDetails: (String)-> Unit){
    Image(
        painter = painterResource(id = booki.cover),
        contentDescription = "Book Cover",
        modifier = Modifier
            .padding(15.dp)
            .size(220.dp, 180.dp)
            .clickable(enabled = true, onClick = { openDetails(booki.id) }),
        contentScale = ContentScale.Crop

    )
}

@Composable
fun Title(booki: BookItem){
    Text(
        text = booki.title, fontFamily = font_title,
        fontWeight = FontWeight.Bold,
        color = colorResource(id = R.color.nau),
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )

}

//truyện hot

@Composable
fun Home_back_hot(){
    Column() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 28.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text_Back_hot()
        }
    }


    LazyRow(
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        items(book_hot) { book ->

            Column(Modifier.width(150.dp)) {

                Image(
                    painter = painterResource(id = book.cover),
                    contentDescription = "Book Cover",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(220.dp, 180.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = book.title, fontFamily = font_title,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.nau),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }

        }


    }
}
//Fiction
@Composable
fun Home_back_fiction(){
    Column() {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 28.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text_Back_fiction()
        }
    }


    LazyRow(
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        items(book_fiction) { book ->

            Column(Modifier.width(150.dp)) {

                Image(
                    painter = painterResource(id = book.cover),
                    contentDescription = "Book Cover",
                    modifier = Modifier
                        .padding(15.dp)
                        .size(220.dp, 180.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = book.title, fontFamily = font_title,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.nau),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }

        }


    }
}




