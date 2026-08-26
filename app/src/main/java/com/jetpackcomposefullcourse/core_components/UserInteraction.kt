package com.jetpackcomposefullcourse.core_components

import android.text.Layout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun PartialSelectableText() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        SelectionContainer() {
            Column {
                Text(text = "Seletable Text 1")
                Text(text = "Text 2")
                Text(text = "Text 3")
                Text(text = "Text 4")
                Text(text = "Text 5")
                DisableSelection {
                    Text(text = "This text is not selectable")
                    Text(text = "Neither this one")
                }
            }
        }
    }
}

