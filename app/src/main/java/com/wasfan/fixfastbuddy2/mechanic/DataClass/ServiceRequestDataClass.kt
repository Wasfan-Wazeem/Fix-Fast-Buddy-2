package com.wasfan.fixfastbuddy2.mechanic.DataClass

data class ServiceRequestDataClass(
    val requestId: String,
    val serviceId: String,
    val userPhoneNumber: String,
    val status: String,
    val mechanicPhoneNumber: String?,
    val garageId: String?,
    val date: String,
    val time: String,
    val userLatitude: Double,
    val userLongitude: Double,
    val mechanicLatitude: String?,
    val mechanicLongitude: String?,
    val review: String?,
    val rating: String?,
    val distance: Double,
    val firstName: String,
    val lastName: String,
    val email: String,
    val profileImagePath: String
)
