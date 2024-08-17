package com.example.stock_mate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.stock_mate.ui.sections.StockMateNavHost
import com.example.stock_mate.ui.theme.StockMateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StockMateTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    content = { StockMateNavHost.StockMateNavHost() }
                )
            }
        }
    }
}