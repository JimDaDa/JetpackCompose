package com.example.jetpackcompose

import Login
import SignUp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.navbar.BottomNav
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme{
                Surface(color = MaterialTheme.colors.background) {
                    Main()
                }
            }
            //Gọi hàm Main

        }
    }
}




@Composable
fun Main() {


        // Khai báo navController
        val navController = rememberNavController()

        //Khi mở app, màn hình đầu tiên hiển thị là màn hình login
        NavHost(navController = navController, startDestination = "login") {

            //Khi route= login, app sẽ mở trang login
            composable("login") {
            //Ở trang Login có 3 hàm: hàm mở trang Login, hàm mở trang Sign Up và hàm mở trang Home
                Login(

                    openLoginAction={
                                    navController.navigate("login")
                    },
                    openSignUp={
                               navController.navigate("SignUp")
                    },
                    openMainScreen ={navController.navigate("mainscreen")})

            }


            composable("SignUp"){
                SignUp(

                    openSignUpAction = {
                        //Chuyển trang đến SignUp
                    navController.navigate("SignUp") },

                    openLogin = {
                    navController.navigate("login") }
                ) {

                }
            }

            //Màn hình chính
            composable("mainscreen"){
                MainScreen(openMainScreenAction = {
                    navController.navigate("mainscreen")
                })
            }




    }


    }




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Main()
    }
}