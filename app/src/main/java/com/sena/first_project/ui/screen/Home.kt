package com.sena.first_project.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sena.first_project.ui.section.Content
import com.sena.first_project.ui.section.Footer
import com.sena.first_project.ui.section.Header

@Composable
fun Home(modifier: Modifier = Modifier) {

    Surface(
        modifier = modifier.fillMaxSize(),
        color = Color.Magenta
    ) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            // Primera sección: encabezado
            Header()

            // Segunda sección: contenido central
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(Color.Green)
            ) {
                Content()
            }

            // Tercera sección: pie de página
            Footer()
        }
    }
}