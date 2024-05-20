package com.example.etsppb

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
fun UserSettings(navController: NavHostController) {
    Scaffold(bottomBar = { NavBar(navController, 1) }) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Box(
                        modifier = Modifier
                            .width(360.dp)
                            .height(140.dp)
                            .background(Color.LightGray)
                            .align(Alignment.CenterHorizontally)
                    ) {
                }
                    Box() {
                        Text(text = "Metode Pembayaran")
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Box() {
                        Column {
                            Text(text = "Mastercard")
                            Text(text = "3992028394")
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Box() {
                        Column {
                            Text(text = "Gopay")
                            Text(text = "3992028394")
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Box() {
                        Column {
                            Text(text = "OVO")
                            Text(text = "3992028394")
                        }
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Box() {
                        Column {
                            Text(text = "VISA")
                            Text(text = "3992028394")
                        }
                    }
                    Box(
                        modifier = Modifier
                            .width(360.dp)
                            .height(80.dp)
                            .background(Color.LightGray)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "Ubah Password")
                    }
                    Box(
                        modifier = Modifier
                            .width(360.dp)
                            .height(80.dp)
                            .background(Color.LightGray)
                            .align(Alignment.CenterHorizontally)
                    ) {
                        Text(text = "Ubah Warna")
                    }
            }
        }
    }
}