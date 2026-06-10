package com.example.a123funmath.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.a123funmath.R
import com.example.a123funmath.model.CardItem
import com.example.a123funmath.model.MateriItem

@Composable
fun BelajarDanKuisPenjumlahanSampai10(navController: NavController) {

    val materi = MateriItem(
        background = R.drawable.background_penjumlahan_sampai_10,
        titleImage = R.drawable.text_penjumlahan_sampai_10,
        cards = listOf(
            CardItem(
                title = "Belajar Penjumlahan 10",
                imageRes = R.drawable.card_belajar,
                route = "belajar_penjumlahan_sampai_10"
            ),
            CardItem(
                title = "Kuis Penjumlahan 10",
                imageRes = R.drawable.card_kuis,
                route = "kuis_penjumlahan_sampai_10"
            )
        )
    )

    MateriScreen(
        navController = navController,
        materi = materi
    )
}