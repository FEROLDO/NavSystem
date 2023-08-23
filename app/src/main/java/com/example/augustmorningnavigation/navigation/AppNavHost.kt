package com.example.augustmorningnavigation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.augustmorningnavigation.ui.theme.pages.about.AboutScreen
import com.example.augustmorningnavigation.ui.theme.pages.home.HomeScreen
import com.example.augustmorningnavigation.ui.theme.pages.login.LoginScreen
import com.example.augustmorningnavigation.ui.theme.pages.signup.SignupScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController : NavHostController = rememberNavController(),
               startDestination:String = ROUTE_LOGIN){
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination){
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_SIGNUP){
            SignupScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }

    }
}