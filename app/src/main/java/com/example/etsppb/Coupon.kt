package com.example.etsppb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun Coupon(navController: NavHostController){
    Scaffold(bottomBar = { NavBar(navController = navController, currentIndex = 1 )}) {
        innerPadding -> Column (modifier = Modifier.padding(innerPadding)){
            Text(text = "Coupon Types")
            Row {
                Icon(imageVector = Icons.Outlined.Place, contentDescription = "Airplane")
                Text(text = "Flight Coupons")
            }
        Row {
            Icon(imageVector = Icons.Outlined.Place, contentDescription = "Airplane")
            Text(text = "Train Coupons")
        }
        Row {
            Icon(imageVector = Icons.Outlined.Place, contentDescription = "Airplane")
            Text(text = "Hotel Coupons")
        }
        Row {
            Icon(imageVector = Icons.Outlined.Place, contentDescription = "Airplane")
            Text(text = "Bus Coupons")
        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Best Coupons for You!")
        Box(
            modifier = Modifier
                .width(360.dp)
                .height(80.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Hotel")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .width(360.dp)
                .height(80.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Flight")
        }
    }
    }
}