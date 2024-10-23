package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.lasalleapp.ui.models.News
import com.example.lasalleapp.ui.theme.poppinsFontFamily
import com.example.lasalleapp.utils.newsList

@Composable
fun NewsDetailSecreen(innerPadding: PaddingValues, newsId: Int){
    val new = newsList.find { it.id == newsId }
    if(new != null) {
        Column(modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            AsyncImage(model = new.image, contentDescription = new.title, modifier = Modifier
                .padding(top = 32.dp)
                .clip(
                    RoundedCornerShape(20.dp)
                ))
            Column (modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, top = 32.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(32.dp)
            ){
                Text(text = new.title, style = MaterialTheme.typography.displaySmall)
                Text(text = new.description)
            }
        }
    }else{
        Text(text = "No se encontro la noticia")
    }
}

