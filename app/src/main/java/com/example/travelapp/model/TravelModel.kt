package com.example.travelapp.model

data class TravelModel(
    val category: String,
    val city: String,
    val country: String,
    val description: String,
    val id: String,
    val images: List<Image>,
    var isBookmark: Boolean,
    val title: String
)

