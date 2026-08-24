package com.jetpackcomposefullcourse.fundamentals

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/* What is a composable function */

@Composable
fun Greeting(){
    Text(text = "Hello Jetpack Compose")
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview(){
    Greeting()
}
