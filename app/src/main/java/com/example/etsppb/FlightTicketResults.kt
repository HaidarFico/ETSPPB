package com.example.etsppb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun FlightTicketResults(navController: NavHostController) {
    Scaffold() {
        internalPadding -> Column (modifier = Modifier.padding(internalPadding)){
            Text(text = "22 Jan 2024")
        Box(
            modifier = Modifier
                .width(360.dp)
                .height(140.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
        ) {
        }
        Box(
            modifier = Modifier
                .width(360.dp)
                .height(140.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
        ) {
        }
        Box(
            modifier = Modifier
                .width(360.dp)
                .height(140.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
        ) {
        }
        Box(
            modifier = Modifier
                .width(360.dp)
                .height(140.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
        ) {
        }
        }
    }
}