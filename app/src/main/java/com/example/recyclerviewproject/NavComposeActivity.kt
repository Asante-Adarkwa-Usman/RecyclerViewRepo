package com.example.recyclerviewproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.recyclerviewproject.navigate_compose.ui.CustomButton

class NavComposeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var buttonActiveState by remember { mutableStateOf(true) }


            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                   CustomButton(
                       buttonName = if (buttonActiveState) "Deactivate" else "Activate",
                       backgroundColor = Color.Cyan,
                       textSize = 18,
                       icon = if (buttonActiveState) Icons.Default.VisibilityOff else Icons.Default.Visibility,
                       buttonActiveState = buttonActiveState,
                       onClick =  {buttonActiveState = !buttonActiveState}

                   )
                }
            }
        }
    }
}