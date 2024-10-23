package com.example.lasalleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.lasalleapp.ui.models.BottomNavigationItem
import com.example.lasalleapp.ui.screens.CalendarScreen
import com.example.lasalleapp.ui.screens.ChangeThemeScreen
import com.example.lasalleapp.ui.screens.GradesScreen
import com.example.lasalleapp.ui.screens.HomeScreen
import com.example.lasalleapp.ui.screens.MateriaScreen
import com.example.lasalleapp.ui.screens.NewsDetailSecreen
import com.example.lasalleapp.ui.screens.PasswordScreen
import com.example.lasalleapp.ui.screens.PaymentsScreen
import com.example.lasalleapp.ui.screens.SettingsScreen
import com.example.lasalleapp.ui.theme.LaSalleAppTheme
import com.example.lasalleapp.utils.Screens
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            var selectedItem by rememberSaveable {
                mutableIntStateOf(0)
            }
            LaSalleAppTheme {
                Scaffold (
                    Modifier.fillMaxSize(),
                    bottomBar = {
                        AnimatedNavigationBar(selectedIndex = selectedItem,
                            modifier = Modifier.height(120.dp),
                            barColor = MaterialTheme.colorScheme.primary,
                            cornerRadius = shapeCornerRadius(cornerRadius = 30.dp)
                            ) {
                            BottomNavigationItem.items.forEachIndexed { index, bottomNavigationItem ->
                                Column (modifier = Modifier
                                    .fillMaxSize()
                                    .padding(top = 18.dp)
                                    .clickable {
                                        selectedItem = index
                                        navController.navigate(bottomNavigationItem.route)
                                    }, horizontalAlignment = Alignment.CenterHorizontally){
                                    Icon(imageVector = bottomNavigationItem.icon, contentDescription = bottomNavigationItem.title,
                                        tint = if(selectedItem == index) MaterialTheme.colorScheme.onPrimary else MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.5f))
                                    Text(text = bottomNavigationItem.title, color = MaterialTheme.colorScheme.onPrimary, fontSize = 12.sp)
                                }
                            }
                        }
                    }
                ){innerPadding->
                    NavHost(navController = navController, startDestination = Screens.Home.route) {
                        composable(route= Screens.Home.route){
                            HomeScreen(innerPadding = innerPadding, navController = navController)
                        }
                        composable(route= Screens.Calendar.route){
                            CalendarScreen(innerPadding = innerPadding)
                        }
                        composable(route= Screens.Grades.route){
                            GradesScreen(innerPadding = innerPadding, navController = navController)
                        }
                        composable(route= Screens.Materia.route+"/{materiaId}", arguments = listOf(
                            navArgument("materiaId"){
                                type = NavType.IntType
                            }
                        )){
                            val materiaId = it.arguments?.getInt("materiaId") ?: 0
                            MateriaScreen(innerPadding = innerPadding, idMateria = materiaId)
                        }
                        composable(route= Screens.Settings.route){
                            SettingsScreen(innerPadding = innerPadding, navController = navController)
                        }
                        composable(route = Screens.Payments.route){
                            PaymentsScreen(innerPadding = innerPadding)
                        }
                        composable(route = Screens.Password.route){
                            PasswordScreen(innerPadding = innerPadding)
                        }
                        composable(route = Screens.ChangeTheme.route){
                            ChangeThemeScreen(innerPadding = innerPadding)
                        }
                        composable(
                            route= Screens.NewsDetail.route+"/{newsId}",
                            arguments = listOf(navArgument("newsId"){
                                type= NavType.IntType
                            })
                        ){
                            val newsId = it.arguments?.getInt("newsId") ?: 0
                            NewsDetailSecreen(innerPadding = innerPadding, newsId = newsId)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LaSalleAppTheme {
        Greeting("Android")
    }
}