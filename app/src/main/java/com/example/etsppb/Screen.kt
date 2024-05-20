package com.example.etsppb

sealed class Screen(val route: String) {
    object HomePage: Screen(route = "home_page_screen")
    object UserSettings: Screen(route = "user_settings_screen")
    object Coupon: Screen(route = "coupon_screen")
    object PreviousOrders: Screen(route = "previous_orders_screen")
}