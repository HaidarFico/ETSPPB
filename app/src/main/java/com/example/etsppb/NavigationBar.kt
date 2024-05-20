package com.example.etsppb

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import com.example.etsppb.data.navBarItems

@Composable
fun NavBar(navController: NavHostController, currentIndex: Int) {
    var selectedItemIndex by remember {
        mutableIntStateOf(currentIndex)
    }
    NavigationBar {
        navBarItems.forEachIndexed{ index, item ->
            NavigationBarItem(
                selected = selectedItemIndex == index,
                onClick = {
                    selectedItemIndex = index
                    if (selectedItemIndex == 0){
                        navController.navigate(route = Screen.HomePage.route)
                    }
                    else if(selectedItemIndex == 1) {
                        navController.navigate(route = Screen.Coupon.route)
                    }
                    else if(selectedItemIndex == 2) {
                        navController.navigate(route = Screen.PreviousOrders.route)
                    }
                    else if (selectedItemIndex == 3){
                        navController.navigate(route = Screen.UserSettings.route)
                    }
                    else {
                        navController.navigate(route = Screen.HomePage.route)
                    }
                          },
                icon = {
                    Icon(imageVector = if(index == selectedItemIndex) {item.selectedIcon} else item.unselectedIcon, contentDescription = item.title)
                       },
                label = { Text(text = item.title) })
            }
        }
    }
