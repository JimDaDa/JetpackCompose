package com.example.jetpackcompose.navbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcompose.Account
import com.example.jetpackcompose.Books
import com.example.jetpackcompose.Home

@Composable
//Chuyển trang tương ứng trong Bottom nav
fun BottomNavGraph(navController: NavHostController){
//Trang hiển thị đầu tiên là trang Home

NavHost(navController = navController, startDestination = BottomNav.Home.route  ){
    composable(BottomNav.Home.route){
        Home(openHomeAction ={navController.navigate("home")} )
    }

    composable(BottomNav.Books.route){
        Books(openBooksAction = { navController.navigate("books") })
    }
    composable(BottomNav.Account.route){
        Account(openAccountAction  ={navController.navigate("account")} )
    }


}
}