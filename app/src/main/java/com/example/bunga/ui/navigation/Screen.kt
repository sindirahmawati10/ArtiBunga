package com.example.bunga.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object List : Screen("list")
    object About : Screen("about")
    object Detail: Screen("detail")
}