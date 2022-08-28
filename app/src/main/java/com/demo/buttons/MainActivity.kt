package com.demo.buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.demo.buttons.ui.theme.ButtonsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    ButtonLayout()

                }
            }
        }
    }
}

@Composable
fun ButtonLayout() {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = { /*TODO*/ },

            elevation = ButtonDefaults.elevation(
                pressedElevation = 10.dp
            ),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(2.dp, color = Color.Red),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = Color.Yellow,
                contentColor = Color.Black
            )

        ) {
            Text(text = "Simple Button")
        }

        TextButton(onClick = { /*TODO*/ },
        colors = ButtonDefaults.textButtonColors(

        )) {
            Text(text = "TextButton")

        }

        OutlinedButton(onClick = { /*TODO*/ },
        colors = ButtonDefaults.outlinedButtonColors(

        )) {
            Text(text = "Outlined Button")
        }


    }
}