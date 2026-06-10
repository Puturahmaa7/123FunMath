package com.example.a123funmath.screen

import androidx.compose.foundation.Image
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
import com.example.a123funmath.R
import com.example.a123funmath.model.MateriItem
import com.example.a123funmath.ui.theme.component.Button

@Composable
fun MateriScreen(
    navController: NavController,
    materi: MateriItem
) {

    var currentIndex by remember {
        mutableIntStateOf(0)
    }

    val currentCard = materi.cards[currentIndex]

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(materi.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .padding(bottom = 0.dp)
                    .fillMaxWidth()
                    .weight(2f),
                contentAlignment = Alignment.Center
            ) {

                Button(
                    imageRes = R.drawable.tombol_kiri,
                    size = 70,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 20.dp),
                    onClick = {
                        navController.navigate("home")
                    }
                )

                Image(
                    painter = painterResource(materi.titleImage),
                    contentDescription = null,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .fillMaxWidth()
                        .height(120.dp),
                    contentScale = ContentScale.Fit
                )
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(3f),
                contentAlignment = Alignment.Center
            ) {

                Image(
                    painter = painterResource(currentCard.imageRes),
                    contentDescription = null,
                    modifier = Modifier
                        .size(800.dp, 850.dp)
                        .padding(bottom = 20.dp)
                        .clickable {
                            navController.navigate(currentCard.route)
                        }
                )

                if (currentIndex < materi.cards.lastIndex) {
                    Button(
                        imageRes = R.drawable.tombol_next_kanan,
                        size = 70,
                        modifier = Modifier
                            .align(Alignment.CenterEnd)
                            .padding(end = 180.dp),
                        onClick = {
                            currentIndex++
                        }
                    )
                }

                if (currentIndex > 0) {
                    Button(
                        imageRes = R.drawable.tombol_next_kiri,
                        size = 70,
                        modifier = Modifier
                            .align(Alignment.CenterStart)
                            .padding(start = 180.dp),
                        onClick = {
                            currentIndex--
                        }
                    )
                }
            }
        }
    }
}