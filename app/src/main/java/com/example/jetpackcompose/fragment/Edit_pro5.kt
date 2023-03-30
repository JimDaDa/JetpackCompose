package com.example.jetpackcompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.font_heading
import com.example.jetpackcompose.ui.theme.font_title

@Composable

fun Edit_pro5( openEdit_pro5:() -> Unit, openAccount:() -> Unit){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.background))) {
            //Thanh top bar
            TopAppBar(title = {
                Text(
                    text = "Edit Profile",
                    fontFamily = font_heading,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(id = R.color.nau),
                    fontSize = 20.sp,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
                )
            }, navigationIcon = {
                IconButton(onClick = {openAccount() }){
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back", Modifier.padding(horizontal = 5.dp)) }
            },

                elevation = 0.dp,
                backgroundColor = Color.Transparent)


        Column(modifier = Modifier
            .fillMaxSize()
            .padding(70.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally) {

            //Hàm Set ảnh ava
            Box(
                modifier = Modifier
                    .fillMaxWidth(), contentAlignment = Alignment.Center
            ) {

//}


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
                    IconButton(onClick = {}, modifier = Modifier.align(Alignment.Bottom)) {
                        Image(
                            painterResource(id = R.drawable.edit),
                            contentDescription = "Edit Profile",
                            modifier = Modifier.size(20.dp, 20.dp),
                            alignment = Alignment.Center
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))

                }

            }
            Spacer(modifier = Modifier.height(10.dp))
            //Text view tên hiển thị
            Text(text = "Cao Nguyễn Kỳ Duyên",
                modifier = Modifier.padding(1.dp),
                fontFamily = font_title,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                color = colorResource(
                    id = R.color.nau),
                textAlign= TextAlign.Center)
        }
        Spacer(modifier = Modifier.height(10.dp))
            // Hàm Hiển thị tên và email
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight(0.60f)
                    .padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                //Hàm outline text
                OutlineText()


            //Button logout
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                //Khi click vòa button sẽ chuyển sang trang đăng nhập
                onClick = {openAccount()},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor =
                    colorResource(id = R.color.bar), contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
            )
            {
                Text(text = "SAVE")
            }
        }


        }
            }


@Composable

fun OutlineText(){
    var name_edit by remember {
        mutableStateOf("")
    }
    var email_edit by remember {
        mutableStateOf("")
    }
    var phone_edit by remember {
        mutableStateOf("")
    }
//Name
    OutlinedTextField(value = name_edit, onValueChange = { newValue ->
        name_edit = newValue
    }, textStyle = TextStyle(
        color = Color.Black,
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light

    ),
        placeholder = { Text(text = "Name: ") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth(0.8f)
   )
    Spacer(modifier = Modifier.padding(10.dp))
    //Email

    OutlinedTextField(value = email_edit, onValueChange = { newValue ->
        email_edit = newValue
    }, textStyle = TextStyle(
        color = Color.Black,
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light

    ),
        placeholder = { Text(text = "Email: ") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth(0.8f)
    )
    Spacer(modifier = Modifier.padding(10.dp))
    //Phone

    OutlinedTextField(value = phone_edit, onValueChange = { newValue ->
        phone_edit = newValue
    }, textStyle = TextStyle(
        color = Color.Black,
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light

    ),
        placeholder = { Text(text = "Phone: ") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth(0.8f)
    )
    Spacer(modifier = Modifier.padding(10.dp))

}