package com.hilberling.treblleapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hilberling.treblleapp.ui.screens.SignUp
import com.hilberling.treblleapp.ui.theme.TreblleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TreblleAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Authentication()
                }
            }
        }
    }
}

@Composable
fun Authentication() {
    SignUp()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TreblleAppTheme {

    }
}