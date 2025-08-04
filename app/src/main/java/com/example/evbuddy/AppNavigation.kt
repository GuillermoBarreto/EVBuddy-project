package com.example.evbuddy.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.evbuddy.models.Driver

@Composable
fun AppNavigation(navController: NavHostController, drivers: List<Driver>) {
    NavHost(navController = navController, startDestination = "driver_list") {
        composable("driver_list") {
            DriverListScreen(drivers)
        }
    }
}