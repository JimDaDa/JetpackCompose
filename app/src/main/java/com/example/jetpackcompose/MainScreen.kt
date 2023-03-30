package com.example.jetpackcompose

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedContentScope.SlideDirection.Companion.Down
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcompose.navbar.BottomNav
import com.example.jetpackcompose.navbar.BottomNav.Account.icon
import com.example.jetpackcompose.navbar.BottomNavGraph
import com.example.jetpackcompose.ui.theme.Purple200

@Composable

fun MainScreen(openMainScreenAction: () -> Unit){
    val navController = rememberNavController()

    Scaffold( bottomBar = {BottomBar(navController=navController)}, backgroundColor = colorResource(
        id = R.color.bar
    )) { paddingValues ->
        Row(modifier = Modifier
            .background(colorResource(id = R.color.bar))
            .padding(paddingValues)
        ) {
            BottomNavGraph(navController = navController)
        }
    }



}
@Composable
fun BottomBar(navController: NavHostController){
    val screens = listOf(
        BottomNav.Home,
        BottomNav.Books,
        BottomNav.Account

    )
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination =navBackStackEntry?.destination


    Row(modifier = Modifier
        .padding(8.dp)
        .background(colorResource(id = R.color.bar))
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        screens.forEach{screens -> Additem(screen = screens, currentDestination = currentDestination, navController = navController)}
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun RowScope.Additem(
    screen: BottomNav,
    currentDestination: NavDestination?,
    navController: NavHostController

){

    //Custom navigation bar

    //route đến trang được chọn
    val selected = currentDestination?.hierarchy?.any{
        it.route==screen.route}==true

    // tạo màu background, khi chọn sẽ là màu trắng còn khi không chọn thì không có màu
    val background = if(selected)  colorResource(id = R.color.border).copy(alpha = 0.3f) else Color.Transparent
    //Màu của Nội dung, nếu chọn sẽ có màu trắng, còn khi không chọn sẽ là màu nâu
    val contentColor = if (selected) Color.White else colorResource(id = R.color.nau)
    val tabSelect= screen
    Box(modifier = Modifier
        //Chiều cao của thanh nav bar
        .height(40.dp)
        //icon hình tròn
        .clip(CircleShape)
        .background(background)
        //Sự kiện click
        .clickable(onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id)
                launchSingleTop = true } })) {
        Row(modifier = Modifier
                //Khoảng cách cái icon đối với thanh nav bar
            .padding(start = 20.dp, end=20.dp,top=10.dp, bottom = 10.dp),
            //căn giữa theo chiều dọc
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                //Custom Icon trên nav bar
             Icon(imageVector =screen.icon , contentDescription = "Navigation icon", tint =contentColor)
            //Khi chọn vào biểu tượng sẽ hiển thị title
            AnimatedVisibility(visible = selected) {
                Text(text = screen.title, color = contentColor)
            }

        }
    }
}






