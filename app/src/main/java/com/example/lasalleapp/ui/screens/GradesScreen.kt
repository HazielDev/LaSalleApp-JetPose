package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.lasalleapp.ui.components.OptionCard
import com.example.lasalleapp.ui.models.Semestre
import com.example.lasalleapp.utils.Screens
import com.example.lasalleapp.utils.semestreActual

@Composable
fun GradesScreen(innerPadding:PaddingValues, navController: NavController){
    Column(modifier = Modifier
        .padding(innerPadding)
        .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Materias Semestre Actual:", style = MaterialTheme.typography.headlineSmall, modifier = Modifier.padding(top = 32.dp, bottom = 32.dp))
        LazyColumn (verticalArrangement = Arrangement.spacedBy(12.dp)){
            items(semestreActual.materias){ mat ->
                OptionCard(texto = mat.nombre, icon = Icons.Default.List) {
                    navController.navigate(Screens.Materia.route+"/${mat.id}")
                }
            }
        }
    }
}