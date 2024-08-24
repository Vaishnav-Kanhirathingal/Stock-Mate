package com.example.stock_mate.ui.sections.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stock_mate.values.CustomSharedValues

object HomeFragment {
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun HomeFragment(
        modifier: Modifier = Modifier,
        toDetailFragment: () -> Unit
    ) {
        ModalNavigationDrawer(
            drawerContent = { HomeDrawer(modifier = Modifier) },
            content = {
                Scaffold(
                    modifier = modifier,
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "Home"
                                )
                            },
                            navigationIcon = {
                                IconButton(
                                    onClick = { /*TODO*/ },
                                    content = {
                                        Image(
                                            imageVector = Icons.Filled.Menu,
                                            contentDescription = "side menu button",
                                            alignment = Alignment.Center,
                                            contentScale = ContentScale.None,
                                            modifier = Modifier
                                                .size(CustomSharedValues.Dimensions.minimumTouchSize)
                                                .clickable(onClick = { TODO() })
                                        )
                                    }
                                )
                            }
                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = { toDetailFragment() },
                            content = {
                                Icon(
                                    imageVector = Icons.Filled.Add,
                                    contentDescription = "create new collection"
                                )
                            }
                        )
                    },
                    floatingActionButtonPosition = FabPosition.End,
                    content = { paddingValues ->
                        Box(
                            modifier = Modifier
                                .padding(paddingValues = paddingValues)
                                .consumeWindowInsets(paddingValues = paddingValues),
                        )
                    },
                )
            }
        )
    }

    @Composable
    fun HomeDrawer(modifier: Modifier) {
        ModalDrawerSheet(
            modifier = modifier,
            content = {
                Text(text = "title")
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    content = {
                        NavigationDrawerItem(
                            icon = {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = null
                                )
                            },
                            label = { Text(text = "button label") },
                            selected = true,
                            onClick = { /*TODO*/ }
                        )
                    }
                )
            }
        )
    }
}

@Preview(device = Devices.PIXEL, showSystemUi = true)
@Composable
fun HomePreview() {
    HomeFragment.HomeFragment(
        modifier = Modifier,
        toDetailFragment = {}
    )
}

//@Preview
//@Composable
//fun DrawerPreview() {
//    HomeFragment.HomeDrawer(modifier = Modifier)
//}