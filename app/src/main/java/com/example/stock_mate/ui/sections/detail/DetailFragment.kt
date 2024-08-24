package com.example.stock_mate.ui.sections.detail

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.stock_mate.values.CustomSharedValues

object DetailFragment {
    object Keys {
        const val STOCK_COLLECTION_KEY = "STOCK_COLLECTION_KEY"
    }

    @Composable
    fun DetailFragment(modifier: Modifier) {
        Scaffold(
            modifier = modifier,
            topBar = { DetailTopBar(modifier = Modifier) },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { TODO("save") },
                    content = {
                        Icon(
                            imageVector = Icons.Default.Done,
                            contentDescription = null
                        )
                    }
                )
            },
            floatingActionButtonPosition = FabPosition.End,
            content = { paddingValues ->
                Content(modifier = Modifier.padding(paddingValues = paddingValues))
            }
        )
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun DetailTopBar(modifier: Modifier) {
        TopAppBar(
            modifier = modifier,
            navigationIcon = {
                IconButton(
                    modifier = Modifier.size(size = CustomSharedValues.Dimensions.minimumTouchSize),
                    onClick = { /*TODO*/ },
                    content = {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = null
                        )
                    }
                )
            },
            title = {
                Text(text = "TITLE")
            },
            actions = {
                IconButton(
                    modifier = Modifier.size(size = CustomSharedValues.Dimensions.minimumTouchSize),
                    onClick = { /*TODO*/ },
                    content = {
                        Icon(
                            imageVector = Icons.Default.Edit,
                            contentDescription = null
                        )
                    }
                )
            }
        )
    }

    @Composable
    fun Content(modifier: Modifier) {

    }
}

@Preview
@Composable
fun DetailPreview() {
    DetailFragment.DetailFragment(modifier = Modifier)
}