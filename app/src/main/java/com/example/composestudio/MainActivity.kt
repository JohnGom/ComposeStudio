package com.example.composestudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.composestudio.ui.ComposeStudioApp
import com.example.composestudio.ui.screens.detail.DetailScreen
import com.example.composestudio.ui.screens.main.MainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeStudioApp {
                /*var (value, onValueChange) = rememberSaveable { mutableStateOf("") }
                StateSample(value = value, onChangeValue = onValueChange)*/
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "main") {
                    composable(route = "main") {
                       MainScreen(onDetail = navController::navigate)
                    }
                    composable(
                        route = "detail/{mediaId}",
                        arguments = listOf(navArgument("mediaId") { type = NavType.IntType })
                    ) { backStackEntry ->
                        val id = backStackEntry.arguments?.getInt("mediaId")
                        requireNotNull(id)
                        DetailScreen(id)
                    }
                }
            }
        }
    }
}