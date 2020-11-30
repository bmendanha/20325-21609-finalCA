/**
 * 20325 - Bruno H. M. Mendanha
 * 21609 - Mark Christian Albinto
 */


package com.demo.mfusion.data

//Declaration of variables
data class Product(
    val id: Int,
    val productName: String,
    val productDescription: String,
    val productImage: String,
    val price: Double,
    var quantity: Int=0
)