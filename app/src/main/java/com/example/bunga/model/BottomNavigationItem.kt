package com.example.bunga.model

import androidx.annotation.DrawableRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.bunga.R

data class BottomNavigationItem(
    val route: String,
    val icon: ImageVector,
    val label: String
) {
    companion object {
        val items = listOf(
            BottomNavigationItem(
                route = "home",
                icon = Icons.Default.Home,
                label = "Home"
            ),
            BottomNavigationItem(
                route = "list",
                icon = Icons.AutoMirrored.Filled.List,
                label = "List"
            ),
            BottomNavigationItem(
                route = "about",
                icon = Icons.Default.Person,
                label = "About"
            ),
        )
    }
}