package com.example.jetpackcompose

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.jetpackcompose.funtion_home.Home_back
import com.example.jetpackcompose.funtion_home.Home_back_fiction
import com.example.jetpackcompose.funtion_home.Home_back_hot
import com.example.jetpackcompose.funtion_home.Home_front
import com.example.jetpackcompose.item.BookItem
import com.example.jetpackcompose.ui.theme.font_heading

@Composable
@OptIn(ExperimentalMaterialApi::class)
fun Home(
    openHomeAction: () -> Unit,
    bookit: List<BookItem>,
    openDetails: (String) -> Unit

){
    val sheetState = rememberBackdropScaffoldState(initialValue = BackdropValue.Concealed)


    BackdropScaffold(
        scaffoldState = sheetState,

        appBar = {
            //Thanh top bar
            TopAppBar(
                title = {
                    Text(
                        text = "Home",
                        fontFamily = font_heading,
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
        backLayerContent = {
            LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(16.dp)){

                item { Home_back(openDetails =openDetails, bookit = bookit) }
                item { Home_back_hot() }
                item { Home_back_fiction() }
            }

        },

        frontLayerContent = {Home_front()},
        peekHeight = 120.dp,
    ){
    }
}

















