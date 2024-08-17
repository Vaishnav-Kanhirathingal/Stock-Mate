package com.example.stock_mate.ui.sections

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.stock_mate.ui.sections.detail.DetailFragment
import com.example.stock_mate.ui.sections.home.HomeFragment

object StockMateNavHost {
    @Composable
    fun StockMateNavHost(modifier: Modifier = Modifier) {
        val navController = rememberNavController()
        NavHost(
            modifier = modifier,
            navController = navController,
            startDestination = Destinations.HOME_SCREEN,
            builder = {
                //----------------------------------------------------------------------------------home
                composable(
                    route = Destinations.HOME_SCREEN,
                    content = { HomeFragment.HomeFragment() }
                )
                //--------------------------------------------------------------------------------detail
                composable(
                    route = Destinations.DETAIL_SCREEN,
                    arguments = listOf(
                        navArgument(
                            name = DetailFragment.Keys.STOCK_COLLECTION_KEY,
                            builder = { type = NavType.StringType }
                        )
                    ),
                    content = { DetailFragment.DetailFragment() }
                )
            }
        )
    }

    object Destinations {
        const val HOME_SCREEN = "homeScreen"
        const val DETAIL_SCREEN = "detailScreen"
    }
}