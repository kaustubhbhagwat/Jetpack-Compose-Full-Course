package com.jetpackcomposefullcourse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.jetpackcomposefullcourse.core_components.ElevatedButtonSample
import com.jetpackcomposefullcourse.core_components.FilledButtonSample
import com.jetpackcomposefullcourse.core_components.FilledTonalButton
import com.jetpackcomposefullcourse.core_components.ImageSample
import com.jetpackcomposefullcourse.core_components.OutlinedButtonSample
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
//                AnnotatedStringWithListenerSample()
//                FilledButtonSample()
//                FilledTonalButton()
//                OutlinedButtonSample()
//                ElevatedButtonSample()
                ImageSample()
            }
        }
    }
}