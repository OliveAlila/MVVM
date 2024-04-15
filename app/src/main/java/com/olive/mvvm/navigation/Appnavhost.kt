package com.olive.mvvm.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.olive.mvvm.ui.theme.screens.about.AboutScreen
import com.olive.mvvm.ui.theme.screens.home.HomeScreen
import com.olive.mvvm.ui.theme.screens.registration.RegistrationScreen
import com.olive.mvvm.ui.theme.screens.registration.RegistrationScreen
import com.olive.mvvm.ui.theme.screens.splash.SplashScreen

@Composable
fun Appnavhost(modifier : Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination: String= ROUTE_SPLASH){
    NavHost(navController = navController,
        startDestination= startDestination ,
        modifier= modifier){
        composable( ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_ABOUT){
            AboutScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController )
        }
        composable(ROUTE_REGISTRATION){
            RegistrationScreen(navController )
        }

    }

}

@Preview
@Composable
private fun Appnavhostprev() {
    Appnavhost()
}