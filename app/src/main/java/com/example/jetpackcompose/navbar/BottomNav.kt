package com.example.jetpackcompose.navbar

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.jetpackcompose.R

//Tạo một menu bao gồm các item trong bottom nav
sealed class BottomNav(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object Home: BottomNav(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Books: BottomNav(
        route = "books",
        title = "Books",
        icon = Icons.Default.List
    )

    object Account: BottomNav(
        route = "account",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )

}

sealed class Books(
    val route: String,
    @StringRes val resId:Int){
    object BookList: Books(
        route = "list",
        resId= R.string.list

    )
    object BookDetails: Books(
        route = "details",
        resId= R.string.list

    )
}

