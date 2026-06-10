package com.example.a123funmath.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.ui.graphics.Color
import com.example.a123funmath.R

data class BookItem(
    val title: String,
    val imageRes: Int,
    val route: String
)

@Composable
fun HomeScreen(navController: NavController) {

    val books = listOf(
        BookItem(
            title = "Penjumlahan Sampai 10",
            imageRes = R.drawable.penjumlahan_sampai_10,
            route = "penjumlahan_sampai_10"
        ),

        BookItem(
            title = "Penjumlahan Puluhan",
            imageRes = R.drawable.penjumlahan_puluhan,
            route = "penjumlahan_puluhan"
        )
    )

    var currentBookIndex by remember {
        mutableIntStateOf(0)
    }

    val currentBook = books[currentBookIndex]

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        // Background
        Image(
            painter = painterResource(R.drawable.background_home),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Logo
            Image(
                painter = painterResource(R.drawable.text_123funmath),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.95f)
                    .height(180.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Area Buku dan Tombol
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {

                // Buku (lebih besar)
                Image(
                    painter = painterResource(currentBook.imageRes),
                    contentDescription = null,
                    modifier = Modifier
                        .height(420.dp)
                        .width(470.dp)
                        .border(2.dp, Color.Red)
                )

                // Tombol Kiri
                Image(
                    painter = painterResource(R.drawable.tombol_kiri),
                    contentDescription = "Previous",
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 120.dp)
                        .size(100.dp)
                        .clickable {
                            if (currentBookIndex > 0) {
                                currentBookIndex--
                            }
                        }
                )

                // Tombol Kanan
                Image(
                    painter = painterResource(R.drawable.tombol_kanan),
                    contentDescription = "Next",
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .padding(end = 120.dp)
                        .size(100.dp)
                        .clickable {
                            if (currentBookIndex < books.lastIndex) {
                                currentBookIndex++
                            }
                        }
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}