package com.example.semana07

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.semana07.ui.theme.Semana07Theme
import com.example.semana07.ui.vistas.CounterScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Semana07Theme() {
                Surface(color = MaterialTheme.colorScheme.background) {
                    CounterScreen()
                }
            }
        }
    }
}


