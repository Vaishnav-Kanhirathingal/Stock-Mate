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
            startDestination = HomeFragment.PATH,
            builder = {
                //----------------------------------------------------------------------------------home
                composable(
                    route = HomeFragment.PATH,
                    content = {
                        HomeFragment.HomeFragment(
                            modifier = Modifier,
                            toDetailFragment = {
                                navController.navigate(DetailFragment.PATH)
                            }
                        )
                    }
                )
                //--------------------------------------------------------------------------------detail
                composable(
                    route = DetailFragment.PATH,
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
}