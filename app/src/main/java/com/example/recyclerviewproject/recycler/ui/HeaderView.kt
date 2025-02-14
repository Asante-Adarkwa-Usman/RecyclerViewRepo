package com.example.recyclerviewproject.recycler.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HeaderView() {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        // Header Text
        Text(
            text = "Muffins Menu...",
            fontSize = 24.sp,
            color = Color.White,
            style = TextStyle(
                textAlign = TextAlign.Center
            ),
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(top = 54.dp, bottom = 20.dp)
                .wrapContentHeight(Alignment.CenterVertically)
        )
    }
}

