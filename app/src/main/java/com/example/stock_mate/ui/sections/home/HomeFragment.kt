package com.example.stock_mate.ui.sections.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import com.example.stock_mate.values.CustomSharedValues

object HomeFragment {
    @Composable
    fun HomeFragment(modifier: Modifier = Modifier) {
        ModalNavigationDrawer(
            drawerContent = { HomeDrawer() },
            content = {
                Scaffold(
                    modifier = modifier,
                    topBar = {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            content = {
                                Image(
                                    imageVector = Icons.Filled.Menu,
                                    contentDescription = "side menu button",
                                    alignment = Alignment.Center,
                                    contentScale = ContentScale.None,
                                    modifier = Modifier
                                        .size(CustomSharedValues.Dimensions.minimumTouchSize)
                                        .clickable(
                                            onClick = {
                                                TODO()
                                            }
                                        )
                                )
                                Text(
                                    text = "Home",
                                    modifier = Modifier.weight(weight = 1f)
                                )
                            }
                        )
                    },
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = { TODO() },
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
    fun HomeDrawer() {
        // TODO: add content
    }
}

@Preview
@Composable
fun HomePreview() {
    HomeFragment.HomeFragment()
}