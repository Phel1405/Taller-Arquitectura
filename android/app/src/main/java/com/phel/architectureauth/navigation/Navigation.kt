package com.phel.architectureauth.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.phel.architectureauth.screens.HomeScreen
import com.phel.architectureauth.screens.LoginScreen

enum class AppScreens{
    LoginScreen,
    HomeScreen
}

@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.LoginScreen.name
    ){
        composable(route = AppScreens.LoginScreen.name){
            LoginScreen(navController)
        }
        composable(route = AppScreens.HomeScreen.name){
            HomeScreen(navController)
        }
    }
}