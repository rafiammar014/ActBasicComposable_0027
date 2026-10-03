package com.example.basiclayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.basiclayout.ui.theme.BasicLayoutTheme
import com.example.basiclayout.ui.theme.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            BasicLayoutTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { _ ->
                    LoginScreen(

                    )
                }
            }
        }
    }
}
