package com.example.stock_mate.data

class StockCollection(
    val id: Int,
    val title: String,
    val stockList: List<StockItem>,
    val lastModified: Long
)