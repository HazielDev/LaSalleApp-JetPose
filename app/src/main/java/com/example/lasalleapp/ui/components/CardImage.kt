package com.example.lasalleapp.ui.components

import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage

@Composable
fun CardImage(image: String){
    Card {
        AsyncImage(model = , contentDescription = )
    }
}

@Preview
@Composable
fun Preview(){
    CardImage(image = "cosmobius.com/Images/logo.png")
}