package com.shivanshu.diary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.shivanshu.diary.navigation.Screen
import com.shivanshu.diary.navigation.SetupNavGraph
import com.shivanshu.diary.ui.theme.DiaryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            DiaryTheme {
                val navController = rememberNavController()
                SetupNavGraph(
                    startDestination = Screen.Authentication.route,
                    navController = navController
                )
            }
        }
    }
}