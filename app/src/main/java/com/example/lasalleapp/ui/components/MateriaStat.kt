package com.example.lasalleapp.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MateriaStat(parcial1: Double, parcial2: Double, parcial3: Double){
    val promedio = (parcial1 * 0.20) + (parcial2 * 0.20) + (parcial3 * 0.60);
    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.spacedBy(32.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(
                width = 2.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )
        ){
            Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Parcial 1", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary, fontSize = 32.sp)
                Column (modifier = Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly){
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Calificación Parcial 1", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary)
                        Text(text = parcial1.toString(), fontWeight = FontWeight.Black)
                    }
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Faltas Parcial 1", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary)
                        Text(text = "1", fontWeight = FontWeight.Black)
                    }
                }
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(
                width = 2.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )
        ){
            Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Parcial 2", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary, fontSize = 32.sp)
                Column (modifier = Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly){
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Calificación Parcial 2", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary)
                        Text(text = parcial2.toString(), fontWeight = FontWeight.Black)
                    }
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Faltas Parcial 1", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary)
                        Text(text = "1", fontWeight = FontWeight.Black)
                    }
                }
            }
        }
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(140.dp)
            .clip(RoundedCornerShape(10.dp))
            .border(
                width = 2.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            )
        ){
            Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceAround){
                Text(text = "Parcial 3", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary, fontSize = 32.sp)
                Column (modifier = Modifier.fillMaxHeight(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly){
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Calificación Parcial 3", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary)
                        Text(text = parcial3.toString(), fontWeight = FontWeight.Black)
                    }
                    Column (horizontalAlignment = Alignment.CenterHorizontally){
                        Text(text = "Faltas Parcial 1", fontWeight = FontWeight.Black, color = MaterialTheme.colorScheme.primary)
                        Text(text = "1", fontWeight = FontWeight.Black)
                    }
                }
            }
        }
        Text(text = "Calificacion Final: "+promedio, style = MaterialTheme.typography.headlineMedium, color = MaterialTheme.colorScheme.primary)
    }
}