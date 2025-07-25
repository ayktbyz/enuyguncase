package com.aytbyz.enuygun.ui.navbar

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.aytbyz.enuygun.presentation.basket.BasketScreen
import com.aytbyz.enuygun.presentation.categories.CategoriesScreen
import com.aytbyz.enuygun.presentation.favorite.FavoriteListScreen
import com.aytbyz.enuygun.presentation.home.HomeScreen
import com.aytbyz.enuygun.presentation.profile.ProfileScreen

@Composable
fun ENNavigationHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ENBottomNavItem.Home.route) {
        composable(ENBottomNavItem.Home.route) { HomeScreen() }
        composable(ENBottomNavItem.Categories.route) { CategoriesScreen() }
        composable(ENBottomNavItem.Favorite.route) { FavoriteListScreen() }
        composable(ENBottomNavItem.Basket.route) { BasketScreen() }
        composable(ENBottomNavItem.Profile.route) { ProfileScreen() }
    }
}