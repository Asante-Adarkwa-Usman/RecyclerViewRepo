package com.example.recyclerviewproject.recycler.model


import kotlinx.coroutines.time.delay
import java.time.Duration

class ProductRepository {
    //Fetching local data
    suspend fun fetchProductData(): List<ProductItems> {
           delay(Duration.ofMillis(2000)) // Simulating a network delay
            return productList // Return the hardcoded list
        }

}
