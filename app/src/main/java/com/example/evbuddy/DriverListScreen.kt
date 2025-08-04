package com.example.evbuddy.ui.theme

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.evbuddy.models.Driver

@Composable
fun DriverListScreen(drivers: List<Driver>) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("EVBuddy - Drivers") })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp)
        ) {
            items(drivers) { driver ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = "Name: ${driver.name}", style = MaterialTheme.typography.bodyLarge)
                        Text(text = "Vehicle: ${driver.vehicleModel}")
                        Text(text = "Plate: ${driver.licensePlate}")
                    }
                }
            }
        }
    }
}