package com.example.lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun PaymentCard(state: Int, fecha: String){
    val backColor = when (state) {
        0 -> MaterialTheme.colorScheme.secondary
        1 -> MaterialTheme.colorScheme.primary
        2 -> Color(0xFF6FDD00)
        else -> MaterialTheme.colorScheme.primary
    }

    val pagoIcon:ImageVector = when (state){
        0 -> Icons.Default.Close
        1 -> Icons.Default.List
        2 -> Icons.Default.CheckCircle
        else -> Icons.Default.Close
    }

    Box (modifier = Modifier
        .fillMaxWidth()
        .height(120.dp)
        .padding(start = 16.dp, end = 16.dp)
        .clip(
            RoundedCornerShape(10.dp)
        )
        .background(backColor)){
        Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround){
            Icon(imageVector = pagoIcon, contentDescription = "Icon Pago", tint = Color.White, modifier = Modifier.size(52.dp))
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Text(text = "Fecha vencimiento", color = Color.White, fontWeight = FontWeight.W900)
                Text(text = fecha, color = Color.White)
            }
        }
    }
}