import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import com.example.jetpackcompose.R
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SignUp(openSignUpAction: () -> Unit, openLogin: () -> Unit, openHome: () -> Unit) {
    //Layout lớn
    Box(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.background)), contentAlignment = Alignment.Center) {

        //Layout Box để chứa hình
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White), contentAlignment = Alignment.TopCenter
        ) {
            //Gọi hàm chứa hình
            Image()
        }

        //Layout chứa các textfield và button theo chiều dọc
        Column(
            //Căn giữa
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight(0.60f)
                .padding(10.dp)
        ) {
            //Thêm khoảng cách giữa hình và các text field là 220dp
            Spacer(modifier = Modifier.height(260.dp))

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxHeight(0.60f)
                    .padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                //Gọi hàm các text field

                TypeSignUp()

                Spacer(modifier = Modifier.padding(10.dp))

                //Gọi hàm button
                ClickSignUp()
                Spacer(modifier = Modifier.padding(10.dp))
                Text(
                    text = "Have an account? Go to Login",
                    modifier = Modifier.clickable(onClick = {
                       openLogin()
                    }
                    )
                    // })
                )
            }

        }
    }


}

//Hàm chứa ảnh
@Composable
fun Image(){
    Image(
        painterResource(id = R.drawable.signup),
        contentDescription = "Picture",
        modifier = Modifier
            .padding(25.dp)
            .border(BorderStroke(2.dp, colorResource(id = R.color.bar)), RectangleShape)
            .clip(RectangleShape),
        alignment = Alignment.TopCenter,
        contentScale = ContentScale.Crop,

        )
}

//Hàm các text field
@Composable
fun TypeSignUp(){
    var email by remember {
        mutableStateOf("")
    }
    var pass by remember {
        mutableStateOf("")
    }
    val passwordVisibility = remember { mutableStateOf(false) }
    val focusRequester = remember { FocusRequester() }


    OutlinedTextField(value = email, onValueChange = { newValue ->
        email = newValue
    }, textStyle = TextStyle(
        color = Color.Black,
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light

    ),
        placeholder = { Text(text = "Enter Your Email") },
        singleLine = true,
        modifier = Modifier.fillMaxWidth(0.8f),
        leadingIcon = { Icon(Icons.Default.Email, contentDescription = "Email") },
        trailingIcon = {
            IconButton(onClick = { email = "" })
            { Icon(Icons.Default.Clear, contentDescription = "Delete") }
        })


    Spacer(modifier = Modifier.padding(10.dp))

    OutlinedTextField(value = pass, onValueChange = { newValue ->
        pass = newValue
    }, textStyle = TextStyle(
        color = Color.Black,
        fontSize = 16.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light
    ),
        placeholder = { Text(text = "Enter Your Password") },
        singleLine = true,
        visualTransformation = if (passwordVisibility.value) VisualTransformation.None
        else PasswordVisualTransformation(),
        modifier = Modifier.fillMaxWidth(0.8f),
        leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "Password") },
        trailingIcon = {
            IconButton(onClick = { pass = "" })
            { Icon(Icons.Default.Clear, contentDescription = "Delete") }
        })
}
//Hàm button Login
@Composable
fun ClickSignUp(){
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            backgroundColor =
            colorResource(id = R.color.hong), contentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .height(50.dp)
    )
    {
        Text(text = "SIGN UP")
    }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
    SignUp(openSignUpAction = { /*TODO*/ }, openLogin = { /*TODO*/ }) {
        
    }
}
