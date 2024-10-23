package com.example.lasalleapp.ui.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import com.example.lasalleapp.ui.components.OptionCard
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.Screens

@Composable
fun SettingsScreen(innerPadding: PaddingValues, navController: NavController ){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Box (modifier = Modifier
            .height(200.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp))
            .background(MaterialTheme.colorScheme.primary)
        ){
            AsyncImage(model = "https://img.icons8.com/win10/512/FFFFFF/news.png", contentDescription = "Fondo Imafe")
        }
        Box (
            Modifier
                .fillMaxWidth(0.95f)
                .height(120.dp)
                .offset(y = (-75).dp)
                .clip(RoundedCornerShape(40.dp))
                .background(Color.White)
                .border(
                    width = 1.dp,
                    color = MaterialTheme.colorScheme.onSurface,
                    shape = RoundedCornerShape(40.dp)
                )){
            Row (modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly){
                Box (modifier = Modifier
                    .size(80.dp)
                    .border(
                        width = 1.dp,
                        color = MaterialTheme.colorScheme.onSurface,
                        shape = RoundedCornerShape(80.dp)
                    )){
                    AsyncImage(model = "https://i.pinimg.com/736x/a9/0c/20/a90c20667cb9d45cec5fb5406725ba3f.jpg", contentDescription = "Imagen de Perfil", contentScale = ContentScale.Crop, clipToBounds = true, modifier = Modifier.clip(
                        RoundedCornerShape(80.dp)
                    ))
                }
                Column {
                    Text(text = "Ivan Haziel Benito")
                    Text(text = "haziel.benito1@hotmail.com", fontSize = 12.sp)
                }
            }
        }
        Column (verticalArrangement = Arrangement.spacedBy(20.dp)){
            OptionCard(texto = "Cambio de Contraseña", icon = Icons.Default.Lock){
                navController.navigate(Screens.Password.route)
            }
            OptionCard(texto = "Cambiar Tema de la Aplicación", icon = Icons.Default.Edit){
                navController.navigate(Screens.ChangeTheme.route)
            }
            OptionCard(texto = "Pagos de Colegiatura", icon = Icons.Default.ShoppingCart){
                navController.navigate(Screens.Payments.route)
            }
            OptionCard(texto = "Ver Calificaciones", icon = Icons.Default.List){
                navController.navigate(Screens.Grades.route)
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun SettingsPreview(){
    val navController = rememberNavController()
    LaSalleAppTheme {
        SettingsScreen(innerPadding = PaddingValues(0.dp), navController)
    }
}