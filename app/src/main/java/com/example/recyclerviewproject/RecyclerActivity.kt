package com.example.recyclerviewproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.recyclerviewproject.recycler.ui.ProductListScreen

class RecyclerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ProductListScreen() // Calls the composable that displays products
        }
    }
}