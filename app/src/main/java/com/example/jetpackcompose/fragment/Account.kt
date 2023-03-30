package com.example.jetpackcompose.fragment

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.R
import com.example.jetpackcompose.ui.theme.font_heading
import com.example.jetpackcompose.ui.theme.font_title

@Composable
fun Account(openAccountAction: () -> Unit, openLogin: () -> Unit, openEdit: () -> Unit){

    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.background))) {
        Scaffold(topBar = {
            //Thanh top bar
            TopAppBar(title = {
                Text(
                    text = "Account",
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
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(50.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Spacer(modifier = Modifier.height(10.dp))
                    //Hàm Set ảnh ava
                    Box( modifier = Modifier
                        .fillMaxWidth(), contentAlignment = Alignment.Center) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painterResource(id = R.drawable.user_ava),
                                contentDescription = "Avatar",
                                modifier = Modifier
                                    .border(
                                        BorderStroke(2.dp, colorResource(id = R.color.bar)),
                                        shape = CircleShape
                                    )
                                    .clip(CircleShape)
                                    .size(100.dp),
                                alignment = Alignment.TopCenter,
                                contentScale = ContentScale.Crop
                            )
                            IconButton(onClick = {openEdit() }, modifier = Modifier.align(Alignment.Bottom)) {
                                Image(
                                    painterResource(id = R.drawable.edit),
                                    contentDescription = "Edit Profile",
                                    modifier = Modifier.size(20.dp, 20.dp),
                                    alignment = Alignment.Center
                                )
                            }
                        }
                    }
                    // Hàm Hiển thị tên và email
                    ShowInfo()
                    //Button logout
                    Spacer(modifier = Modifier.height(10.dp))
                    Button(
                        //Khi click vòa button sẽ chuyển sang trang đăng nhập
                        onClick = { openLogin() },
                        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.bar),
                            contentColor = Color.White),
                        modifier = Modifier
                            .fillMaxWidth(0.8f)
                            .height(50.dp))
                    { Text(text = "LOGOUT") } } }
            }
    }



   }


@Composable
fun ShowInfo(){
    Text(text = "Cao Nguyễn Kỳ Duyên",
        modifier = Modifier.padding(1.dp),
        fontFamily = font_title,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        color = colorResource(
        id = R.color.nau
        ),
        textAlign= TextAlign.Center)
    Text(text = "caonguyenkyduyen17@gmail.com",
        modifier = Modifier.padding(1.dp),
        fontFamily = font_title,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        color = colorResource(
        id = R.color.nau
        ),
        textAlign= TextAlign.Center)
    Text(text = "Phone: 0373299750",
        modifier = Modifier.padding(1.dp),
        fontFamily = font_title,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp,
        color = colorResource(
            id = R.color.nau
        ),
        textAlign= TextAlign.Center)
}
