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
fun RootNavGraph(
    navController: NavHostController = rememberNavController()
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
                MainNavGraph(
                    toDetail = { id ->
                        navController.navigate(Screen.Detail.route + "/$id")
                    }
                )
            }
            composable(
                route = "${Screen.Detail.route}/{id}",
                arguments = listOf(
                    navArgument("id") {
                        type = NavType.IntType
                    }
                )
            ) {
                val args = it.arguments?.getInt("id")
                DetailRoute(
                    onBackStack = navController::popBackStack,
                    id = args
                )
            }
        }
    }
}