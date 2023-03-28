package com.example.jetpackcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Account(openAccountAction: () -> Unit, openLogin: () -> Unit){
   Box(modifier = Modifier
       .fillMaxSize()
       .background(colorResource(id = R.color.background))) {

      Column(modifier = Modifier
          .fillMaxWidth()
          .background(colorResource(id = R.color.background))
          .padding(70.dp),
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally) {

          //Hàm Set ảnh ava
            SetAva()
          // Hàm Hiển thị tên và email
            ShowInfo()

          //Button logout
            Spacer(modifier = Modifier.height(10.dp))
          Button(
              //Khi click vòa button sẽ chuyển sang trang đăng nhập
              onClick = {
                  openLogin()
              },
              colors = ButtonDefaults.buttonColors(
                  backgroundColor =
                  colorResource(id = R.color.bar), contentColor = Color.White
              ),
              modifier = Modifier
                  .fillMaxWidth(0.8f)
                  .height(50.dp)
          )
          {
              Text(text = "LOGOUT")
          }


      }

       }
   }

@Composable
fun SetAva(){
    Image(
        painterResource(id = R.drawable.user_ava),
        contentDescription = "Avatar",
        modifier = Modifier
            .padding(25.dp)
            .border(BorderStroke(2.dp, colorResource(id = R.color.bar)), shape = CircleShape)
            .clip(CircleShape)
            .size(100.dp),
        alignment = Alignment.Center,
        contentScale = ContentScale.Crop,

        )
}

@Composable
fun ShowInfo(){
    Text(text = "Cao Nguyễn Kỳ Duyên",
        modifier = Modifier.padding(1.dp),
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        color = colorResource(
        id = R.color.nau))
    Text(text = "caonguyenkyduyen17@gmail.com",
        modifier = Modifier.padding(1.dp),
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
        fontSize = 15.sp,
        color = colorResource(
        id = R.color.nau))
    Text(text = "Phone: 0373299750",
        modifier = Modifier.padding(1.dp),
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
        fontSize = 15.sp,
        color = colorResource(
            id = R.color.nau))
}
