package com.jetpackcomposefullcourse.core_components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jetpackcomposefullcourse.R

@Composable
fun ImageSample() {
    val rainbowColors = remember {
        Brush.sweepGradient(
            listOf(
                Color.Blue,
                Color.Red,
                Color.Magenta,
                Color.Yellow,
                Color.Cyan
            )
        )
    }
    val borderWidth = 4.dp
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painter = painterResource(R.drawable.fabric),
            contentDescription = "Fabric",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(350.dp)
                .border(BorderStroke(borderWidth, rainbowColors)),
            alignment = Alignment.Center
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ImageSamplePreview() {
    ImageSample()
}