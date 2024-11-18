package com.example.bunga.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.bunga.model.BottomNavigationItem
import com.example.bunga.ui.route.AboutRoute
import com.example.bunga.ui.route.DetailRoute
import com.example.bunga.ui.route.HomeRoute
import com.example.bunga.ui.route.ListRoute

@Composable
fun MainNavGraph(
    navController: NavHostController = rememberNavController(),
    toDetail: (Int) -> Unit
) {
    Box(
        contentAlignment = Alignment.BottomCenter,
    ) {
        NavHost(
            modifier = Modifier,
            navController = navController,
            startDestination = Screen.Home.route
        ) {
            composable(Screen.Home.route) {
                HomeRoute(
                    toDetail = toDetail
                )
            }
            composable(Screen.List.route) {
                ListRoute(
                    toDetail = toDetail
                )
            }
            composable(Screen.About.route) {
                AboutRoute()
            }
        }
        NavigationBar(
            containerColor = Color.White,
            contentColor = MaterialTheme.colorScheme.tertiary,
            tonalElevation = 0.dp
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination
            BottomNavigationItem.items.forEach { item ->
                NavigationBarItem(
                    colors = NavigationBarItemColors(
                        selectedIndicatorColor = MaterialTheme.colorScheme.primary,
                        selectedTextColor = Color.Black,
                        selectedIconColor = Color.Black,
                        unselectedIconColor = Color.Black,
                        unselectedTextColor = Color.Black,
                        disabledIconColor = Color.Black,
                        disabledTextColor = Color.Black
                    ),
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            tint = when (currentDestination?.hierarchy?.any { it.route == item.route } == true) {
                                true -> Color.Black
                                false -> Color.DarkGray
                            },
                            contentDescription = null
                        )
                    },
                    label = {
                        Text(
                            text = item.label,
                            color = when (currentDestination?.hierarchy?.any { it.route == item.route } == true) {
                                true -> Color.Black
                                false -> Color.DarkGray
                            },
                        )
                    },
                    selected = currentDestination?.hierarchy?.any { it.route == item.route } == true,
                    onClick = {
                        navController.navigate(item.route) {
                            // Pop up to the start destination of the graph to
                            // avoid building up a large stack of destinations
                            // on the back stack as users select items
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            // Avoid multiple copies of the same destination when
                            // reselecting the same item
                            launchSingleTop = true
                            // Restore state when reselecting a previously selected item
                            restoreState = true
                        }
                    }
                )
            }
        }
    }
}