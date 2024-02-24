package com.example.tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tarjetapresentacion.ui.theme.TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    presentacion()
                }
            }
        }
    }
}

@Composable
fun presentacion() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Utiliza un Surface con un fondo azul marino oscuro
        Surface(
            modifier = Modifier
                .size(120.dp)
                .padding(8.dp),
            shape = MaterialTheme.shapes.medium,
            color = Color(0xFF001F3F) // Código de color para azul marino oscuro
        ) {
            // La imagen ahora tiene un fondo azul marino oscuro
            val image = painterResource(R.drawable.android_logo)
            Image(
                painter = image,
                contentDescription = "android",
                modifier = Modifier.size(120.dp)
            )
        }
        Text(
            text = "Oliver Vallejos",
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontSize = 38.sp,
        )
        Text(
            text = "Extraordinario desarrollador de Android",
            fontSize = 12.sp,
            color = Color(0xFF3ddc84)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TarjetaPresentacionTheme {
        presentacion()
    }
}