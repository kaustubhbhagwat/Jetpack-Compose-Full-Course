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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withLink

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

@Composable
fun AnnotatedStringWithListenerSample() {
    val uriHandler = LocalUriHandler.current

    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(buildAnnotatedString {
            append("Build Faster apps with")
            val linkAnnotation = LinkAnnotation.Url(
                "https://developer.android.com/develop/ui/compose/documentation",
                styles = TextLinkStyles(SpanStyle(color = Color.Blue))
            ) {
                val url = (it as LinkAnnotation.Url).url
                uriHandler.openUri(url)
            }
            withLink(linkAnnotation) {
                append(" Jeptack Compose")
            }
        })
    }
}

