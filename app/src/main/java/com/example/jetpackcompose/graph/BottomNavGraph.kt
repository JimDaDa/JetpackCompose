package com.example.jetpackcompose.graph

import Login
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackcompose.fragment.*
import com.example.jetpackcompose.item.*
import com.example.jetpackcompose.navbar.BottomNav


@Composable
//Chuyển trang tương ứng trong Bottom nav
fun BottomNavGraph(navController: NavHostController){
//Trang hiển thị đầu tiên là trang Home

NavHost(navController = navController, startDestination = BottomNav.Home.route  ){
    composable(BottomNav.Home.route){
        Home(
            openHomeAction = {navController.navigate("home")}, bookit = bookitems, book_detective = book_detective, book_fiction = book_fiction, bookhot = book_hot)

        { navController.navigate("details") }
    }

    composable(BottomNav.Books.route){
        Books(openBooksAction = { navController.navigate("books") }, bookitems = bookitems,
            openDetails = {navController.navigate("details")}) }

    composable(BottomNav.Account.route){
        Account(openAccountAction  ={navController.navigate("account")},
            openLogin = {navController.navigate(("login")) },
            openEdit = {
                navController.navigate("edit") }
        ) }

    composable("edit"){
        Edit_pro5(openEdit_pro5={navController.navigate("edit")},
            openAccount = {navController.navigate(BottomNav.Account.route)}) }



    composable("login") {

        //Ở trang Login có 3 hàm: hàm mở trang Login, hàm mở trang Sign Up và hàm mở trang Home
        Login(openLoginAction={ navController.navigate("login") }, openSignUp={ navController.navigate("SignUp") },
            openMainScreen ={navController.navigate("mainscreen")})
    }

    composable(route= "details"){ Book_Details(post = book1,  bookHot= book2, bookFiction= book3,bookDetective=book4, state = LazyListState()) } }

}
