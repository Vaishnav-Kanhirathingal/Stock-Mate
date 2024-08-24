package com.example.stock_mate.ui.sections.detail

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
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
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.stock_mate.values.CustomSharedValues

object DetailFragment {
    const val PATH = "detailScreen"

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
        // TODO:
    }

    @Composable
    fun StockList(){

    }

    @Composable
    fun StockListItem(modifier: Modifier) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
            content = {
                BasicTextField(
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 16.dp),
                    value = "Temp",
                    onValueChange = { TODO() }
                )
                TextButton(
                    modifier = Modifier.size(size = CustomSharedValues.Dimensions.minimumTouchSize),
                    onClick = { TODO() },
                    content = { Text(text = "+") }
                )
                Text(
                    modifier = Modifier.padding(all = 4.dp),
                    text = "1",
                    textAlign = TextAlign.Center,
                    maxLines = 1,
                )
                TextButton(
                    modifier = Modifier
                        .size(size = CustomSharedValues.Dimensions.minimumTouchSize)
                        .padding(end = 4.dp),
                    onClick = { TODO() },
                    content = { Text(text = "-") }
                )
            }
        )
    }
}

//@Preview
//@Composable
//fun DetailPreview() {
//    DetailFragment.DetailFragment(modifier = Modifier)
//}

@Preview(widthDp = 360, heightDp = 48)
@Composable
fun StockListItemPreview() {
    DetailFragment.StockListItem(modifier = Modifier)
}