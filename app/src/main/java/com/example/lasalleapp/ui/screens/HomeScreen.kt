package com.example.lasalleapp.ui.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
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
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.lasalleapp.R
import com.example.lasalleapp.ui.components.CardImage
import com.example.lasalleapp.ui.components.Widget
import com.example.lasalleapp.utils.Logout
import com.example.lasalleapp.utils.Screens
import com.example.lasalleapp.utils.communities
import com.example.lasalleapp.utils.newsList
import okhttp3.internal.concurrent.Task

@Composable
fun HomeScreen(innerPadding: PaddingValues, navController: NavController) {
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(MaterialTheme.colorScheme.background)
            .padding(innerPadding),

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
                Row ( horizontalArrangement = Arrangement.Start, verticalAlignment = Alignment.CenterVertically){
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "logo",
                        Modifier
                            .size(80.dp)
                    )
                    Column (Modifier.padding(start = 10.dp)){
                        Text(text = "¡Hola!", color = Color.White, fontSize = 18.sp)
                        Text(
                            text = "Ivan Haziel",
                            color = Color.White,
                            fontSize = 22.sp,
                            fontWeight = FontWeight.W900
                        )
                    }
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
                        Widget(icon = Icons.Default.CheckCircle, texto = "2 Tareas" )
                        Box (modifier = Modifier.clickable { navController.navigate(Screens.Payments.route) }){
                            Widget(icon = Icons.Default.ShoppingCart, texto = "Pagos" )
                        }
                    }
                }
                Column (modifier = Modifier.padding(start = 10.dp, end = 10.dp)){
                    Text(text = "Noticias", fontSize = 25.sp, fontWeight = FontWeight.W900)
                    LazyRow (modifier = Modifier.padding(bottom = 32.dp), horizontalArrangement = Arrangement.spacedBy(16.dp)){
                        items(newsList){ news ->
                            CardImage(news = news){
                                Log.i("News", it.id.toString())
                                navController.navigate(Screens.NewsDetail.route+"/${news.id}")
                            }
                        }
                    }
                    Text(text = "Noticias", fontSize = 25.sp, fontWeight = FontWeight.W900)
                    LazyVerticalGrid(
                        columns = GridCells.Fixed(2),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                    ) {
                        items(communities){com -> 
                            Box(
                                modifier = Modifier
                                    .size(180.dp)
                                    .padding(16.dp)){
                                AsyncImage(model = com.image, contentDescription = "Community", modifier = Modifier.fillMaxSize())
                            }
                        }
                    }
                }
            }
        }
    }
}
