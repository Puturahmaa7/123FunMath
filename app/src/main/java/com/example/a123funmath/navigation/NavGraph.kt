
package com.example.a123funmath.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a123funmath.screen.HomeScreen
import com.example.a123funmath.screen.PenjumlahanSampai10Screen
import com.example.a123funmath.screen.PenjumlahanPuluhanScreen

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {

        composable("home") {
            HomeScreen(navController)
        }

        composable("penjumlahan_sampai_10") {
            PenjumlahanSampai10Screen(navController)
        }

        composable("penjumlahan_puluhan") {
            PenjumlahanPuluhanScreen(navController)
        }
    }
}