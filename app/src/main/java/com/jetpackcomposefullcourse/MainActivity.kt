package com.jetpackcomposefullcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jetpackcomposefullcourse.core_components.AnnotatedStringWithListenerSample
import com.jetpackcomposefullcourse.core_components.PartialSelectableText
import com.jetpackcomposefullcourse.core_components.SimpleOutlineTextField
import com.jetpackcomposefullcourse.core_components.TextFieldWihPassword
import com.jetpackcomposefullcourse.fundamentals.AccessStringResource
import com.jetpackcomposefullcourse.fundamentals.Greeting
import com.jetpackcomposefullcourse.ui.theme.JetpackComposeFullCourseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeFullCourseTheme {
//                Greeting()
//                AccessStringResource()
//                SimpleOutlineTextField()
//                TextFieldWihPassword()
//                PartialSelectableText()
                AnnotatedStringWithListenerSample()
            }

        }
    }
}