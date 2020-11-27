package com.demo.mfusion.data

data class Product(
    val id: Int,
    val productName: String,
    val productDescription: String,
    val productImage: String,
    val price: Double,
    var quantity: Int=0
)