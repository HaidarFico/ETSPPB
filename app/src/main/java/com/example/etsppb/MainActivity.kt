package com.example.etsppb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons

import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.etsppb.ui.theme.ETSPPBTheme

data class BottomNavigationItem(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val hasNews: Boolean,
    val badgeCount: Int? = null
)

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ETSPPBTheme {
                val items = listOf(
                    BottomNavigationItem(
                        title = "Home",
                        selectedIcon = Icons.Filled.Home,
                        unselectedIcon = Icons.Outlined.Home,
                        hasNews = false,
                    ),
                    BottomNavigationItem(
                        title = "Promo",
                        selectedIcon = Icons.Filled.ShoppingCart,
                        unselectedIcon = Icons.Outlined.ShoppingCart,
                        hasNews = false
                    ),
                    BottomNavigationItem(
                        title = "My Trip",
                        selectedIcon = Icons.Filled.DateRange,
                        unselectedIcon = Icons.Outlined.DateRange,
                        hasNews = false
                    ),
                    BottomNavigationItem(
                        title = "My Account",
                        selectedIcon = Icons.Filled.Person,
                        unselectedIcon = Icons.Outlined.Person,
                        hasNews = false
                    )
                )
                // A surface container using the 'background' color from the theme
                var selectedItemIndex by remember {
                    mutableIntStateOf(0)
                }
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "home") {

                }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold (
                        bottomBar = {
                            NavigationBar {
                                items.forEachIndexed{ index, item ->
                                NavigationBarItem(
                                    selected = selectedItemIndex == index,
                                    onClick = {
                                        selectedItemIndex = index
//                                        navController.navigate(()

                                    },
                                    icon = {
                                        Icon(imageVector = if(index == selectedItemIndex) {item.selectedIcon} else item.unselectedIcon, contentDescription = item.title)
                                    },
                                    label = { Text(text = item.title)})

                                }
                            }
                        }
                    ){
                        innerPadding-> Column(modifier= Modifier.padding(innerPadding), verticalArrangement = Arrangement.spacedBy(16.dp)) {
                        SearchBar(
                            query = "",
                            onQueryChange = {},
                            onSearch = {},
                            onActiveChange = {},
                            active = false,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(imageVector = Icons.Filled.Search, contentDescription = "Search icon", modifier = Modifier)
                        }
                        Box(modifier = Modifier
                            .width(360.dp)
                            .height(140.dp)
                            .align(Alignment.CenterHorizontally)
                            .background(Color.LightGray)) {
                            Box(){
                                Text(text = "Hello, Haidar Fico")
                            }
                            Box(modifier = Modifier.align(Alignment.BottomCenter)){
                                Column() {
                                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween){
                                        Text(text = "My Points")

                                        Text(text = "My Balance")
                                    }
                                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.Bottom) {
                                        Text(text= "\$XXX")
                                        Text(text = "Connect Now!")
                                    }
                                }
                            }
                        }
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .align(Alignment.CenterHorizontally)
                            .background(Color.White)) {
                            Row (modifier = Modifier
                                .width(280.dp)
                                .align(Alignment.TopCenter), horizontalArrangement = Arrangement.SpaceBetween){
                                Button(onClick = { /*TODO*/ }) {
                                        Icon(imageVector = Icons.Filled.DateRange, contentDescription = "Travel")
                                }
                                Button(onClick = { /*TODO*/ }) {
                                    Icon(imageVector = Icons.Filled.DateRange, contentDescription = "Plane")
                                }
                                Button(onClick = { /*TODO*/ }) {
                                    Icon(imageVector = Icons.Filled.DateRange, contentDescription = "Plane")
                                }
                                Button(onClick = { /*TODO*/ }) {
                                    Icon(imageVector = Icons.Filled.DateRange, contentDescription = "Plane")
                                }
                            }
                        }
                        }
                    }
                }
            }
        }
    }
}

//@Composable
//fun NavBar(color: Color, modifier: Modifier = Modifier) {
//
//}