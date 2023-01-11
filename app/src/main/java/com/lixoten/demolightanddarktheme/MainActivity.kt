package com.lixoten.demolightanddarktheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.lixoten.demolightanddarktheme.ui.theme.DemoLightAndDarkThemeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoLightAndDarkThemeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun AppTopBar() {
    TopAppBar(
        modifier = Modifier,
        //backgroundColor = Color.Transparent,
        backgroundColor = MaterialTheme.colors.background,
        elevation = 0.dp
    ) {
        Text(
            text = "Light and Dark Theme Demo"
        )
    }
}

@Composable
fun Greeting(name: String) {
    Scaffold(
        topBar = { AppTopBar() }
    ) {
        Column(
            modifier = Modifier.padding(32.dp)
        ) {
            Text(
                text = "Hello $name!"
            )
            Text(
                text = "This is the story of a Johnny Rotten It's better to burn out than it is to rust. The king is gone but he's not forgotten. Hey hey, my my. Rock and roll can never die!",
                fontWeight = FontWeight.Bold,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DemoLightAndDarkThemeTheme {
        Greeting("Android")
    }
}