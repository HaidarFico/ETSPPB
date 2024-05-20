package com.example.etsppb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Place
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Coupon(navController: NavHostController){
    Scaffold(bottomBar = { NavBar(navController = navController, currentIndex = 1 )}, topBar = { TopBar(title = "Coupons")}) {
        innerPadding -> Column (modifier = Modifier
        .padding(innerPadding)
        .fillMaxWidth()){
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
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(80.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
                .padding(5.dp, 5.dp)
        ) {
            Column {
                Text(text = "Hotel")
                Text(text = "Myconian Ambassador Hotel Relais & Chateux")
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()){
                    Text(text = "Free Breakfast for a Two Night Stay")
                    Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "4.8")
                        Spacer(modifier = Modifier.width(3.dp))
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "Star Rating")
                    }
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .width(300.dp)
                .height(80.dp)
                .background(Color.LightGray)
                .align(Alignment.CenterHorizontally)
                .padding(5.dp, 5.dp)
        ) {
            Column {
                Text(text = "Plane")
                Text(text = "SBY-CGK")
                Spacer(modifier = Modifier.height(10.dp))
                Row(modifier = Modifier.fillMaxWidth()){
                    Text(text = "50% Off!")
                    Row(horizontalArrangement = Arrangement.End, modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "4.8")
                        Spacer(modifier = Modifier.width(3.dp))
                        Icon(imageVector = Icons.Filled.Star, contentDescription = "Star Rating")
                    }
                }
            }
        }
    }
    }
}

@Composable
@Preview
fun CouponPreview(){
    Coupon(navController = rememberNavController())
}