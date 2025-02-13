package com.example.recyclerviewproject.navigate_compose.ui


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp


@Composable
//Home Screen
fun HomeScreen(
    goToProfile: () -> Unit,

) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text="This is the Home Screen",
                    style = TextStyle(
                        color = Color.Cyan,
                        fontWeight = FontWeight.W600,
                        fontSize = 24.sp)
                )
                Button(onClick = { goToProfile() }) {
                    Text("Go to Profile Screen")
                }

            }
    }
}


//Profile Screen
@Composable
fun ProfileScreen(
    goToSettings: () -> Unit,

    ) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "This is the Profile Screen",
                style = TextStyle(
                    color = Color.LightGray,
                    fontWeight = FontWeight.W600,
                    fontSize = 24.sp)
                )
            Button(onClick = { goToSettings() }) {
                Text("Go to Settings Screen")
            }
            }

        }
    }

//Profile Screen
@Composable
fun SettingScreen(
    goBackToHome: () -> Unit,

    ) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "This is the Settings Screen",
                style = TextStyle(
                    color = Color.Red,
                    fontWeight = FontWeight.W600,
                    fontSize = 24.sp)
            )
            Button(onClick = { goBackToHome() }) {
                Text("Go to Home Screen")
            }
        }


    }
}
