package com.example.myapplication


import MatuleTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.myapplication.ui.screen.singIn.RecoverPasswordScreen
import com.example.myapplication.ui.screen.singIn.SingInScreen
import com.example.myapplication.ui.screen.singIn.SingUpScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MatuleTheme{
                SingUpScreen()
            }
        }
    }
}
