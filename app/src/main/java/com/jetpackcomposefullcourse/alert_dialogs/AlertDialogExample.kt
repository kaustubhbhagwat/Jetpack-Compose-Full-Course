package com.jetpackcomposefullcourse.alert_dialogs

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.jetpackcomposefullcourse.R


@Composable
fun DialogWithImage() {

    val context = LocalContext.current
    Dialog(
        onDismissRequest = {  },
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp)
        ) {

            Image(
                painter = painterResource(R.drawable.fabric),
                contentDescription = "Image",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier.height(160.dp).fillMaxWidth()
            )
            Text(
                text = "This is a Dialog",
                modifier = Modifier.padding(16.dp)
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                TextButton(onClick = {
                    Toast.makeText(
                        context,
                        "You can do any action on click of this button",
                        Toast.LENGTH_LONG
                    ).show()
                }) {
                    Text("Confirm")

                }
                TextButton(onClick = {}) {
                    Text("Dismiss")
                }
            }
        }
    }
}