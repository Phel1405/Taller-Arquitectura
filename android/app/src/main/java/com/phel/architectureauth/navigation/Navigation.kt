package com.phel.architectureauth.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.phel.architectureauth.screens.HomeScreen
import com.phel.architectureauth.screens.LoginScreen
import com.phel.architectureauth.screens.ProductsScreen
import com.phel.architectureauth.screens.RegisterScreen
import com.phel.architectureauth.screens.UsersScreen

enum class AppScreens{
    LoginScreen,
    RegisterScreen,
    UsersScreen,
    ProductsScreen,
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
        composable(route = AppScreens.RegisterScreen.name){
            RegisterScreen(navController)
        }
        composable(route = AppScreens.UsersScreen.name){
            UsersScreen(navController)
        }
        composable(route = AppScreens.ProductsScreen.name){
            ProductsScreen(navController)
        }
    }
}