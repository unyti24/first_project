package com.sena.first_project.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Home(modifier: Modifier = Modifier){
    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.Magenta
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Red)
            )
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 150.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .background(Color.Blue)
                )
                Box(modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .background(Color.Yellow)
                )
                Box(modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .background(Color.Black)
                )

            }
        }

    }
}