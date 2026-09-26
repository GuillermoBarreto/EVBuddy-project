package com.example.evbuddy.ui.theme

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.evbuddy.models.Driver

@Composable
fun AppNavigation(navController: NavHostController, drivers: List<Driver>) {
    NavHost(navController = navController, startDestination = DRIVER_LIST_ROUTE) {
        composable(DRIVER_LIST_ROUTE) {
            DriverListScreen(drivers)
        }
    }
}

private const val DRIVER_LIST_ROUTE = "driver_list"