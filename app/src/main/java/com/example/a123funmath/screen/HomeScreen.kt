package com.example.a123funmath.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.a123funmath.R

@Composable
fun HomeScreen(navController: NavController) {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        // Background
        Image(
            painter = painterResource(R.drawable.bg_home),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )


        // Menu bawah tengah
        Row(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 40.dp),

            horizontalArrangement = Arrangement.spacedBy(30.dp),
            verticalAlignment = Alignment.Bottom
        ) {


            // STUDY
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {
                    navController.navigate("study")
                }
            ) {

                Image(
                    painter = painterResource(R.drawable.study),
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )

                Spacer(modifier = Modifier.height(6.dp))

            }

            // TEST
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(R.drawable.test),
                    contentDescription = null,
                    modifier = Modifier.size(90.dp)
                )

                Spacer(modifier = Modifier.height(6.dp))

            }
        }
    }
}