package com.example.jetpackcompose.navbar

import Login
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcompose.*
import com.example.jetpackcompose.item.*


@Composable
//Chuyển trang tương ứng trong Bottom nav
fun BottomNavGraph(navController: NavHostController){
//Trang hiển thị đầu tiên là trang Home

NavHost(navController = navController, startDestination = BottomNav.Home.route  ){
    composable(BottomNav.Home.route){
        Home(openHomeAction = {navController.navigate("home")}, bookit = bookitems,
            openDetails ={navController.navigate("details")}) }
    composable(BottomNav.Books.route){
        Books(openBooksAction = { navController.navigate("books") }, bookitems = bookitems,
            openDetails = {navController.navigate("details")}) }
    composable(BottomNav.Account.route){
        Account(openAccountAction  ={navController.navigate("account")},
            openLogin = {navController.navigate(("login"))}, openEdit = {navController.navigate("edit")}) }
    composable("edit"){
        Edit_pro5(openEdit_pro5={navController.navigate("edit")},
            openAccount = {navController.navigate(BottomNav.Account.route)}) }
    composable("login") {
        //Ở trang Login có 3 hàm: hàm mở trang Login, hàm mở trang Sign Up và hàm mở trang Home
        Login(openLoginAction={ navController.navigate("login") }, openSignUp={ navController.navigate("SignUp") },
            openMainScreen ={navController.navigate("mainscreen")}) }
    composable(route= "details"){ Book_Details(post = book1, state = LazyListState()) } }

}