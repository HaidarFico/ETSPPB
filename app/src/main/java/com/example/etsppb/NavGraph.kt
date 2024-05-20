package com.example.etsppb

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
     NavHost(navController = navController, startDestination = Screen.HomePage.route) {
         composable(
             route = Screen.HomePage.route
         ){
             HomePage(navController)
         }
         composable(
             route = Screen.UserSettings.route
         ){
             UserSettings(navController)
         }
         composable(
             route = Screen.Coupon.route
         ) {
             Coupon(navController = navController)
         }
         composable(
             route = Screen.PreviousOrders.route
         ) {
             PreviousOrders(navController = navController)
         }
     }
}