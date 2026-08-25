package com.jetpackcomposefullcourse.core_components

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import java.nio.file.WatchEvent

@Composable
fun SimpleText() {
    Box(
        modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Text(
            "Hello Jetpack Compose",
            color = Color.Blue,
            fontSize = 24.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black,
                    blurRadius = 25f
                )
            )
        )

    }
}

@Composable
fun ColorfulTextFunction() {
    val rainbowColors = listOf(
        Color.Blue,
        Color.Red,
        Color.Magenta
    )

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(text = buildAnnotatedString {
            append("DO NOT ALLOW PEOPLE TO DIM YOUR SHINE \n")
            withStyle(
                SpanStyle(
                    brush = Brush.linearGradient(colors = rainbowColors)
                )
            ) {
                append("Because they are blinded.")
            }
            append("\n and tell them to do some sunglasses on")
        })
    }
}

@Composable
fun BasicScrollableText(){
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center){
        Text(text = "This is kaustubh bhagwat experimenting with Jetpack Compose",
            maxLines = 2,
            fontSize = 50.sp,
            overflow = TextOverflow.Ellipsis)
    }
}


@Preview(showSystemUi = true)
@Composable
fun SimpleTextPreview() {
//    SimpleText()
//    ColorfulTextFunction()
    BasicScrollableText()
}