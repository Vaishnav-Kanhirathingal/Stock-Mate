package com.example.stock_mate.ui.sections.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

object DetailFragment {
    object Keys {
        const val STOCK_COLLECTION_KEY = "STOCK_COLLECTION_KEY"
    }

    @Composable
    fun DetailFragment(modifier: Modifier = Modifier) {
        Scaffold(
            modifier = modifier,
            topBar = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    content = {
                        TODO()
                    }
                )
            },
            floatingActionButton = {
                TODO()
            },
            floatingActionButtonPosition = FabPosition.End,
            content = { paddingValues ->
                Box(
                    modifier = Modifier.padding(paddingValues = paddingValues),
                )
            }
        )
    }

    @Composable
    fun TopBar(){
        Row(
            modifier = Modifier.fillMaxWidth(),
            content = {
                TODO()
            }
        )
    }
}