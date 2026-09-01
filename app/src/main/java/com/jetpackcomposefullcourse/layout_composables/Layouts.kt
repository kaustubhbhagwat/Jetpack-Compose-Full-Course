package com.jetpackcomposefullcourse.layout_composables

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 1. Column , allows you to place its children in a vertical sequence.

@Composable
fun ColumnExample() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Blue)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text("Text 1")
            Spacer(modifier = Modifier.height(10.dp))
            Text("Text 2")
            Spacer(modifier = Modifier.height(10.dp))
            Text("Text 3")
            Spacer(modifier = Modifier.height(10.dp))
            Text("Text 4")
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {}) {
                Text("Next")
            }
        }
    }
}

// 2. Row , allows you to place its children in a horizontal sequence.

@Composable
fun RowExample() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(16.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text("Text 1")
        Spacer(modifier = Modifier.width(10.dp))
        Text("Text 2")
        Spacer(modifier = Modifier.width(10.dp))
        Text("Text 3")
        Spacer(modifier = Modifier.width(10.dp))
        Text("Text 4")
        Spacer(modifier = Modifier.width(20.dp))
        Button(onClick = {}) {
            Text("Next")
        }
    }
}

@Composable
fun BoxExample() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color = Color.Red),
            contentAlignment = Alignment.Center,
        ) {
            Box(
                modifier = Modifier
                    .size(100.dp)
                    .background(color = Color.Black)
            ) {

            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun ColumnExamplePreview() {
//    ColumnExample()
//    RowExample()
    BoxExample()
}

