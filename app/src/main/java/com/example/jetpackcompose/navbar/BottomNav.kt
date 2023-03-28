package com.example.jetpackcompose.navbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.ui.graphics.vector.ImageVector

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

