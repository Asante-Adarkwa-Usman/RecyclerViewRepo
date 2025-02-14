package com.example.recyclerviewproject.recycler.ui

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage


@Composable
fun ProductCardView(
    productImage: String,
    productName: String,
    productPrice: Float,
    productDescription: String,
    productRating: Float

) {
    val context = LocalContext.current
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)

    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
                .clickable {
                    // Show toast with price and rating when clicked
                    Toast.makeText(
                        context,
                        "Price: $$productPrice | Rating: $productRating",
                        Toast.LENGTH_SHORT
                    ).show()
                },

        ) {
            //Product Image
            AsyncImage(
                model = productImage,
                contentDescription = "$productName image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentScale = ContentScale.Crop
            )

            // Product Name
            Text(
                text = productName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 8.dp)
            )

            // Product Price
            Text(
                text = productPrice.toString(),
                fontSize = 16.sp,
                color = Color(0xFF388E3C) // Equivalent to holo_green_dark
            )

            // Product Description
            Text(
                text = productDescription,
                fontSize = 14.sp,
                color = Color.Gray,
                maxLines = 3,
                overflow = TextOverflow.Ellipsis

            )
        }
    }
}


