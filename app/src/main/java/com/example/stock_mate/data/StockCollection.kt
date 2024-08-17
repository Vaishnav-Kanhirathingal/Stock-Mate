package com.example.stock_mate.data

class StockCollection(
    val id: Int,
    val title: String,
    val orderConfig: OrderConfig,
    val stockList: List<StockItem>,
    val lastModified: Long
)

data class OrderConfig(
    val orderBy: OrderByEnum,
    val inAscendingOrder: Boolean
)

enum class OrderByEnum { NAME, QUANTITY }