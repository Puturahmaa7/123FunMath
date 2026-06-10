package com.example.a123funmath.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.a123funmath.R
import com.example.a123funmath.model.CardItem
import com.example.a123funmath.model.MateriItem

@Composable
fun MetodePenjumlahanSampai10(navController: NavController) {

    val materi = MateriItem(
        background = R.drawable.background_penjumlahan_sampai_10,
        titleImage = R.drawable.text_penjumlahan_sampai_10,
        cards = listOf(
            CardItem(
                title = "Yuk Kenalan",
                imageRes = R.drawable.card_yuk_kenalan,
                route = "belajar_dan_kuis_penjumlahan_sampai_10"
            ),
            CardItem(
                title = "Belajar Pasangan Bilangan",
                imageRes = R.drawable.card_pasangan_bilangan,
                route = "belajar_dan_kuis_penjumlahan_sampai_10"
            ),
            CardItem(
                title = "Belajar Menghitung Maju",
                imageRes = R.drawable.card_menghitung_maju,
                route = "belajar_dan_kuis_penjumlahan_sampai_10"
            ),
            CardItem(
                title = "Belajar Penjumlahan Berulang",
                imageRes = R.drawable.card_penjumlahan_berulang,
                route = "belajar_dan_kuis_penjumlahan_sampai_10"
            ),
            CardItem(
                title = "Belajar Penjumlahan Yang Hasilnya 10",
                imageRes = R.drawable.card_penjumlahan_yang_hasilnya_10,
                route = "belajar_dan_kuis_penjumlahan_sampai_10"
            )

        )
    )

    MateriScreen(
        navController = navController,
        materi = materi
    )
}