package com.example.evbuddy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.evbuddy.models.Driver
import com.example.evbuddy.ui.theme.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EVBuddyApp()
        }
    }
}

@Composable
fun EVBuddyApp() {
    val navController = rememberNavController()
    val drivers = listOf(
        Driver("Alice", "Tesla Model S", "ABC123"),
        Driver("Bob", "Nissan Leaf", "XYZ789"),
        Driver("Charlie", "Chevy Bolt", "EV5555")
    )
    AppNavigation(navController, drivers)
}