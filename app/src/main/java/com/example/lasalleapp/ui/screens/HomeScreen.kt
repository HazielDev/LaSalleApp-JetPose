package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.components.Widget
import com.example.lasalleapp.utils.Logout

@Composable
fun HomeScreen(innerPadding: PaddingValues) {
    Column(
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomEnd = 40.dp, bottomStart = 40.dp))
                .height(270.dp)
                .background(MaterialTheme.colorScheme.primary)
        ) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "Background",
                Modifier
                    .fillMaxWidth()
                    .offset(y = 80.dp),
                contentScale = ContentScale.Crop
            )
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween) {
                //TODO LOGO
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "logo",
                    Modifier
                        .size(80.dp)
                )
                Column (Modifier.padding(start = 10.dp)){
                    Text(text = "¡Hola!", color = Color.White, fontSize = 18.sp)
                    Text(
                        text = "Nombre",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.W900
                    )
                }
                Icon(imageVector = Logout, contentDescription = "Logout", tint = Color.White)
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
        ){
            Column (Modifier.fillMaxSize()){
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .offset(y = (-50).dp)
                        .padding(horizontal = 24.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(MaterialTheme.colorScheme.background)
                        .height(140.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Row (
                        modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Widget(icon = Icons.Default.DateRange, texto ="Sin evento" )
                        Widget(icon = Icons.Default.DateRange, texto ="Sin eventos" )
                        Widget(icon = Icons.Default.DateRange, texto ="Sin eventos" )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Prev() {
    LaSalleAppTheme {
        HomeScreen(innerPadding = PaddingValues(0.dp))
    }
}