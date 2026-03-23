package com.agustinmp.challenge1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.agustinmp.challenge1.ui.theme.Challenge1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Challenge1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    WelcomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White) // Fondo Blanco real
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(40.dp))

        // La imagen central
        Image(
            painter = painterResource(id = R.drawable.logo_welcome),
            contentDescription = "Welcome Illustration",
            // Cambiamos el size fijo por un weight para que se adapte al espacio
            modifier = Modifier.weight(1.5f)
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Título Azul
        Text(
            text = "Discover Your\nDream Job here",
            color = Color(0xFF1F41BB),
            fontSize = 32.sp,
            lineHeight = 40.sp, // <-- Ajustá este valor (más alto = más separación)
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Subtítulo gris
        Text(
            text = "Explore all the existing job roles based on your\ninterest and study major",
            color = Color.DarkGray,
            fontSize = 14.sp, // Acá tampoco
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(64.dp))

        // Fila para los botones (uno al lado del otro)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            // Botón Login (Azul)
            Button(
                onClick = { /* TODO */ },
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1F41BB)),
            ) {
                Text("Login", color = Color.White)
            }

            Spacer(modifier = Modifier.width(16.dp))

            // Botón Register (Transparente con texto negro)
            TextButton(
                onClick = { /* TODO */ },
                modifier = Modifier
                    .weight(1f)
                    .height(50.dp)
            ) {
                Text("Register", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }

        Spacer(modifier = Modifier.height(32.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    Challenge1Theme {
        WelcomeScreen()
    }
}