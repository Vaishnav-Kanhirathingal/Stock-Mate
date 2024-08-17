package com.example.stock_mate.values

import androidx.compose.ui.unit.dp
import com.example.stock_mate.data.StockCollection
import com.example.stock_mate.data.StockItem

class CustomSharedValues {
    object Dimensions {
        val minimumTouchSize = 48.dp
    }

    object DemoData {
        val stockCollectionList = listOf(
            StockCollection(
                id = 0,
                title = "title 0",
                stockList = listOf(
                    StockItem(itemName = "item 1 t0", count = 1),
                    StockItem(itemName = "item 2 t0", count = 2),
                    StockItem(itemName = "item 3 t0", count = 3),
                    StockItem(itemName = "item 4 t0", count = 4),
                ), lastModified = 0
            ),
            StockCollection(
                id = 1,
                title = "title 1",
                stockList = listOf(
                    StockItem(itemName = "item 1 t1", count = 1),
                    StockItem(itemName = "item 2 t1", count = 2),
                    StockItem(itemName = "item 3 t1", count = 3),
                    StockItem(itemName = "item 4 t1", count = 4),
                ),
                lastModified = 0
            ),
            StockCollection(
                id = 2,
                title = "title 2",
                stockList = listOf(
                    StockItem(itemName = "item 1 t2", count = 1),
                    StockItem(itemName = "item 2 t2", count = 2),
                    StockItem(itemName = "item 3 t2", count = 3),
                    StockItem(itemName = "item 4 t2", count = 4),
                ), lastModified = 0
            ),
            StockCollection(
                id = 3,
                title = "title 3",
                stockList = listOf(
                    StockItem(itemName = "item 1 t3", count = 1),
                    StockItem(itemName = "item 2 t3", count = 2),
                    StockItem(itemName = "item 3 t3", count = 3),
                    StockItem(itemName = "item 4 t3", count = 4),
                ),
                lastModified = 0
            ),
        )
    }
}