package com.example.a123funmath.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a123funmath.R

data class StudyMenu(
    val image: Int
)

@Composable
fun StudyScreen(navController: NavController) {

    val menus = listOf(

        StudyMenu(R.drawable.tambah),

        StudyMenu(R.drawable.kurang),

        StudyMenu(R.drawable.kali),

        StudyMenu(R.drawable.bagi)
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        // Background
        Image(
            painter = painterResource(R.drawable.bg_study),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column {

            Spacer(modifier = Modifier.height(20.dp))

            // Tombol back
            Image(
                painter = painterResource(R.drawable.back),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .size(60.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )

            Spacer(modifier = Modifier.height(10.dp))



            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.padding(horizontal = 20.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {

                items(menus) {

                    StudyCard(it)
                }
            }
        }
    }
}

@Composable
fun StudyCard(menu: StudyMenu) {

    Image(
        painter = painterResource(menu.image),
        contentDescription = null,

        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .clickable {

            },

        contentScale = ContentScale.FillBounds
    )
}