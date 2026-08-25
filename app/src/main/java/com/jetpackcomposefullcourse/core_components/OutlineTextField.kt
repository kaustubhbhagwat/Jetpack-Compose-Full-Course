package com.jetpackcomposefullcourse.core_components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleOutlineTextField() {
    var text by remember { mutableStateOf("") }

    val rainbowColors = listOf(
        Color.Blue,
        Color.Red,
        Color.Magenta
    )
    var brush = remember {
        Brush.linearGradient(colors = rainbowColors)
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
//        OutlinedTextField(
//            value = text,
//            onValueChange = {
//                text = it
//            },
//            label = { Text("Name") }
//        )
        TextField(
            value = text,
            onValueChange = { text = it },
            textStyle = TextStyle(brush = brush)
        )
    }


}

@Preview(showSystemUi = true)
@Composable
fun Preview() {
    SimpleOutlineTextField()
}