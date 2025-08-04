package com.example.evbuddy.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("EVBuddy Home") })
        }
    ) {
        // Add content later
    }
}