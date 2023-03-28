package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.item.book_detective
import com.example.jetpackcompose.item.bookitems
import kotlinx.coroutines.launch

@Composable
fun Home(openHomeAction: () -> Unit){
    Homeitem()
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Homeitem() {


  //val sheetState= rememberBottomSheetScaffoldState(bottomSheetState  =BottomSheetState(BottomSheetValue.Collapsed))

    //val coroutineScope = rememberCoroutineScope()




    val sheetState = rememberBackdropScaffoldState(initialValue = BackdropValue.Concealed)

    val coroutineScope = rememberCoroutineScope()
    BackdropScaffold(
        scaffoldState = sheetState,

        appBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Home",
                        fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.nau),
                        fontSize = 20.sp,
                        modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
                    )
                },

                elevation = 0.dp,
                backgroundColor = Color.Transparent
            )

        },

//Phần màn hình chính
        backLayerContent = { Home_back() },
        frontLayerContent = {Home_front()},
        peekHeight = 120.dp,
    ){
    }
}
@Composable
fun Text_Front(){
    Text(
        text = "Trending",
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        color = colorResource(id = R.color.nau),
        fontSize = 20.sp,
        modifier = Modifier.padding(horizontal = 10.dp)
    )
}

@Composable
fun Text_Back(){
    Text(
        text = "My books",
        fontFamily = FontFamily.SansSerif,
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
fun Home_back(){
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

        items(bookitems) { book ->

            Column(Modifier.width(150.dp)) {

                Image(
                    painter = painterResource(id = book.cover),
                    contentDescription = "Book Cover",
                    modifier = Modifier
                        .padding(15.dp)
                        .fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = book.title, fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.nau),
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }

        }


    }
}


@Composable
fun Home_front(){
    Spacer(modifier = Modifier.height(20.dp))
    //Text_Front()
    Column_w()
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
                    painter = painterResource(id = book.book.cover),
                    contentDescription = "Book Cover",
                    modifier = Modifier
                        .padding(15.dp)
                        .aspectRatio(1f)
                        .fillMaxHeight(), contentScale = ContentScale.FillHeight
                )
                Column(Modifier.weight(1f)) {
                    Text(
                        text = book.book.title, fontFamily = FontFamily.SansSerif,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.nau),
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(vertical = 20.dp)

                    )
                    Text(
                        text = book.authors, fontFamily = FontFamily.SansSerif,
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

@Composable
fun Column_w(){
    Column(Modifier.wrapContentSize().fillMaxSize().padding(8.dp),
    verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.Start) {
        Text_Front()
    }
}









