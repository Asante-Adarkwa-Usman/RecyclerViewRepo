package com.example.recyclerviewproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recyclerviewproject.navigate_compose.ui.HomeScreen
import com.example.recyclerviewproject.navigate_compose.ui.ProfileScreen
import com.example.recyclerviewproject.navigate_compose.ui.SettingScreen

class NavComposeActivity : ComponentActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
             //setting a navController
            val navController = rememberNavController()
            //Setting a Navigation Host
            NavHost(navController = navController, startDestination="Home"){
                //the navigation graph
                composable(route = "Home"){
                    HomeScreen { navController.navigate(route = "Profile") }
                }
                composable(route = "Profile"){
                    ProfileScreen { navController.navigate(route = "Settings") }
                }
                composable(route = "Settings"){
                    SettingScreen { navController.navigate(route = "Home") }
                }
            }
        }
    }
}