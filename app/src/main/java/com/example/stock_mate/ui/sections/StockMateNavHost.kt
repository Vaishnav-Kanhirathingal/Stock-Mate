package com.example.stock_mate.ui.sections

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.stock_mate.ui.sections.detail.DetailFragment
import com.example.stock_mate.ui.sections.home.HomeFragment

object StockMateNavHost {
    @Composable
    fun StockMateNavHost(modifier: Modifier = Modifier) {
        val navController = rememberNavController()
        NavHost(
            modifier = modifier,
            navController = navController,
            startDestination = Destinations.HomeScreen.PATH,
            builder = {
                //----------------------------------------------------------------------------------home
                composable(
                    route = Destinations.HomeScreen.PATH,
                    content = {
                        HomeFragment.HomeFragment(
                            modifier = Modifier,
                            toDetailFragment = {
                                navController.navigate(Destinations.DetailScreen.PATH)
                            }
                        )
                    }
                )
                //--------------------------------------------------------------------------------detail
                composable(
                    route = Destinations.DetailScreen.PATH,
//                    arguments = listOf(
//                        navArgument(
//                            name = DetailFragment.Keys.STOCK_COLLECTION_KEY,
//                            builder = { type = NavType.StringType }
//                        )
//                    ),
                    content = {
                        DetailFragment.DetailFragment(
                            modifier = Modifier
                        )
                    }
                )
            }
        )
    }

    object Destinations {
        object HomeScreen {
            const val PATH = "homeScreen"
        }

        object DetailScreen {
            const val PATH = "detailScreen"
        }
    }
}

// TODO: move path variable