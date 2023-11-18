package com.example.navigationcontroller

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph(){

    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = Destinations.dogScreen){
        composable(Destinations.catScreen){
            CatScreen(navController)
        }
        composable(Destinations.dogScreen){
            DogScreen(navController)
        }
    }


}