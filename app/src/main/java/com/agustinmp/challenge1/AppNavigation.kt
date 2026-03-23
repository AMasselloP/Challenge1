package com.agustinmp.challenge1

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation() {

    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = "welcome") {


        composable("welcome") {
            WelcomeScreen(
                onNavigateToLogin = { navController.navigate("login") },
                onNavigateToRegister = { navController.navigate("register") }
            )
        }


        composable("login") {
            LoginScreen()
        }


        composable("register") {
            RegisterScreen()
        }
    }
}