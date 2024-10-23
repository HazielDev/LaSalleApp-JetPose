package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.lasalleapp.ui.components.MateriaStat
import com.example.lasalleapp.ui.models.Semestre
import com.example.lasalleapp.utils.semestreActual

@Composable
fun MateriaScreen(innerPadding: PaddingValues, idMateria: Int){
    val mat = semestreActual.materias.find { it.id == idMateria }
    if(mat != null){
        Column(modifier = Modifier
            .padding(innerPadding)
            .padding(start = 16.dp, end = 12.dp, top = 12.dp)) {
            Text(text = mat.nombre, fontSize = 36.sp, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.ExtraBold)
            Text(text = "Resúmen Semestral", color = MaterialTheme.colorScheme.primary)
            MateriaStat(parcial1 = mat.calificacion.parcial1, parcial2 = mat.calificacion.parcial2, parcial3 = mat.calificacion.parcial3)
        }
    }else{
        Column(modifier = Modifier.padding(innerPadding), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "No se encontro la Matería buscada :((")
        }
    }
}