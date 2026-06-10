
package com.example.a123funmath.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a123funmath.screen.BelajarDanKuisPenjumlahanPuluhan
import com.example.a123funmath.screen.BelajarDanKuisPenjumlahanSampai10
import com.example.a123funmath.screen.HomeScreen
import com.example.a123funmath.screen.MetodePenjumlahanPuluhan
import com.example.a123funmath.screen.MetodePenjumlahanSampai10

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

        composable("metode_penjumlahan_sampai_10") {
            MetodePenjumlahanSampai10(navController)
        }

        composable("metode_penjumlahan_puluhan") {
            MetodePenjumlahanPuluhan()
        }

        composable("belajar_dan_kuis_penjumlahan_puluhan") {
            BelajarDanKuisPenjumlahanPuluhan()
        }

        composable("belajar_dan_kuis_penjumlahan_sampai_10") {
            BelajarDanKuisPenjumlahanSampai10(navController)
        }
    }
}