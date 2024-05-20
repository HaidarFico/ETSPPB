package com.example.etsppb

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun PreviousOrders(navController: NavHostController){
    Scaffold (bottomBar = { NavBar(navController = navController, currentIndex = 2)}) {
        internalPadding -> Column (modifier = Modifier.padding(internalPadding)){
           Box() {
               Text(text = "Temp")
           }
        }
    }
}