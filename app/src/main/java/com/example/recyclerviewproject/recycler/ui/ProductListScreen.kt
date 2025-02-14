package com.example.recyclerviewproject.recycler.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recyclerviewproject.recycler.vm.ProductViewModel

@Composable
fun ProductListScreen(viewModel: ProductViewModel = viewModel() ) {
    val productList by viewModel.products.observeAsState(initial = emptyList())

    // Fetch products when the screen appears
    LaunchedEffect(viewModel) {
        viewModel.getProductsData()
    }

    Scaffold(
        topBar = { HeaderView() } // Header at the top
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier.fillMaxSize()
        ) {
            //Rendering product List using a LazyColumn
            items(productList) { product ->
                ProductCardView(
                    productName = product.name,
                    productImage = product.imageUrl,
                    productPrice = product.price,
                    productDescription = product.description,
                    productRating = product.rating,
                )
            }
        }
    }
}

