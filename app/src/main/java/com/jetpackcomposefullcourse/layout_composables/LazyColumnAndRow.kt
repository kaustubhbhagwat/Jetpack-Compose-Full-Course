package com.jetpackcomposefullcourse.layout_composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Lazy Column

@Composable
fun LazyColumnExample() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Lazy Column")
        LazyColumn() {
            items(100) { index ->
                Text(
                    "This is item no $index",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.Magenta)
                )
            }
        }
    }
}
@Composable
fun LazyRowExample() {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text("Lazy Column")
        LazyRow() {
            items(100) { index ->
                Text(
                    "This is item no $index",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp)
                        .background(Color.Magenta)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LazyColumnExamplePreview() {
//    LazyColumnExample()
    LazyRowExample()
}