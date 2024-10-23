package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lasalleapp.ui.components.PaymentCard

@Composable
fun PaymentsScreen(innerPadding: PaddingValues){
    Column(modifier = Modifier
        .padding(innerPadding)
        .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.spacedBy(16.dp)){
        Text(text = "Pagos Vencidos:", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.W900, modifier = Modifier.padding(start = 16.dp, top = 32.dp))
        PaymentCard(state = 0, fecha = "23 / 10 / 2024")
        Text(text = "Pagos Pendientes:", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.W900, modifier = Modifier.padding(start = 16.dp))
        PaymentCard(state = 1, fecha = "23 / 10 / 2024")
        Text(text = "Pagos Terminados:", fontSize = 24.sp, color = MaterialTheme.colorScheme.primary, fontWeight = FontWeight.W900, modifier = Modifier.padding(start = 16.dp))
        PaymentCard(state = 2, fecha = "23 / 10 / 2024")
        PaymentCard(state = 2, fecha = "23 / 10 / 2024")
        Spacer(modifier = Modifier.height(50.dp))
    }
}