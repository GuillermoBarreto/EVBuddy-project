package com.example.evbuddy.models

/**
 * An EV driver listed in the app.
 *
 * @property name the driver's display name
 * @property vehicleModel the EV model the driver operates, e.g. "Nissan Leaf"
 * @property licensePlate the vehicle license plate, also used as the lazy-list key
 */
data class Driver(
    val name: String,
    val vehicleModel: String,
    val licensePlate: String
)
