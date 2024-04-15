package com.olive.mvvm.ui.theme.screens.about

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olive.mvvm.R
import com.olive.mvvm.navigation.ROUTE_HOME
import java.nio.file.WatchEvent


@Composable
fun AboutScreen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White))
    {
        Text(text = "This is the About Screen",
            color = Color.White,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive
        )
    }
    Spacer(modifier = Modifier.height(20.dp))
    Button(onClick = {
        navController.navigate(ROUTE_HOME)
    },
        modifier = Modifier.width(300.dp)) {
        Text(text = "Home Page",
            fontSize = 28.sp,
            fontFamily = FontFamily.Cursive)

    }
}

@Preview
@Composable
private fun Aboutprev() {
    AboutScreen(navController = rememberNavController())

}
