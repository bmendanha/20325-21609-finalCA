package com.demo.mfusion.data.source

import com.demo.mfusion.data.Product

interface ProductDataSource {

    fun getProduct(productId: Int): Product?

    fun getProducts(): List<Product>
}