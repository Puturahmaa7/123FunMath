package com.example.a123funmath.ui.theme.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.size

@Composable
fun Button(
    modifier: Modifier = Modifier,
    imageRes: Int,
    contentDescription: String = "",
    onClick: () -> Unit,
    size: Int = 70

) {
    Image(
        painter = painterResource(imageRes),
        contentDescription = contentDescription,
        modifier = modifier
            .size(size.dp)
            .clickable { onClick() }
    )
}