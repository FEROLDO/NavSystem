package com.example.augustmorningnavigation.ui.theme.pages.home

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.augustmorningnavigation.ui.theme.AugustMorningNavigationTheme
import com.example.augustmorningnavigation.ui.theme.pages.login.LoginScreen

@Composable
fun HomeScreen(navController: NavController){
    Text(text = "Welcome to home screen")

}

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreview() {
    AugustMorningNavigationTheme {
        HomeScreen(rememberNavController())
    }

}