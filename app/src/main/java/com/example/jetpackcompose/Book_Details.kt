package com.example.jetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.item.*
import com.example.jetpackcompose.ui.theme.font_title

@Composable

fun Book_Details(

    post: BookItem,
    state: LazyListState= rememberLazyListState()){
    LazyColumn(contentPadding = PaddingValues(16.dp), modifier = Modifier.fillMaxSize(), state = state){
        postContentitem(post)
    }


}


fun LazyListScope.postContentitem(post: BookItem){
    item {

        Box(modifier = Modifier
            .background(colorResource(id = R.color.background))
            .fillMaxSize(1f).fillMaxWidth(), contentAlignment = Alignment.TopCenter) {
            Box(
                modifier = Modifier
                    .wrapContentSize()
                    .padding(0.dp, 20.dp, 0.dp, 0.dp),
                contentAlignment = Alignment.Center

            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {

                    Image_cover(post)
                    Spacer(modifier = Modifier.height(18.dp))
                    Details(post)
                    Spacer(modifier = Modifier.height(18.dp))
                    //Button
                    Button(
                        //Khi click vòa button sẽ chuyển sang trang màn hình chính
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor =
                            colorResource(id = R.color.bar), contentColor = Color.White
                        ),
                        modifier = Modifier
                            .width(150.dp)
                            .height(50.dp)
                    )
                    {
                        Text(text = "READ")
                    }
                }

            }

        }
    }
}

@Composable
fun Image_cover(post: BookItem){
    Image(
        painter = painterResource(id = post.cover),
        contentDescription = "Book Cover",
        modifier = Modifier
            .padding(15.dp)
            .size(220.dp, 300.dp),
        Alignment.Center,
        contentScale = ContentScale.Crop
    )
}

@Composable
fun Details(post: BookItem){

    Text(
        text = post.title, fontFamily = font_title,
        fontWeight = FontWeight.Bold,
        color = colorResource(id = R.color.nau),
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.height(8.dp))
    Text(
        text = post.authors, fontFamily = font_title,
        fontWeight = FontWeight.Light,
        color = colorResource(id = R.color.nau),
        fontSize = 16.sp,
        textAlign = TextAlign.Center
    )
    Spacer(modifier = Modifier.height(8.dp))
    OutlinedTextField(value = post.details, onValueChange ={}, readOnly = true , textStyle = TextStyle(
        color = colorResource(id = R.color.nau),
        fontSize = 16.sp,
        fontFamily = font_title,
        fontWeight = FontWeight.Light) )
}
@Preview(showSystemUi = true)
@Composable

fun Preview(){
    Book_Details(post = book1)
}