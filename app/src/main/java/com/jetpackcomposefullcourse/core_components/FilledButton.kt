package com.jetpackcomposefullcourse.core_components

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun FilledButtonSample() {
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            onClick = {
                Toast.makeText(context, "Button Clicked", Toast.LENGTH_SHORT).show()
            },

            ) {
            Text("Next")
        }
    }
}

// Tonal Button

@Composable
fun FilledTonalButton() {
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        FilledTonalButton(onClick = {
            Toast.makeText(context, "Tonal Button Clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text("Tonal Button")
        }

    }
}

//Outlined Button
@Composable
fun OutlinedButtonSample() {
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        OutlinedButton(onClick = {
            Toast.makeText(context, "Outlined Button Clicked", Toast.LENGTH_SHORT).show()
        }
        ) {
            Text("Outlined Button")
        }
    }
}

@Composable
fun ElevatedButtonSample(){
    val context = LocalContext.current

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        ElevatedButton(onClick = {
            Toast.makeText(context, "Outlined Button Clicked", Toast.LENGTH_SHORT).show()
        }) {
            Text("Elevated Button")
        }
    }
}


