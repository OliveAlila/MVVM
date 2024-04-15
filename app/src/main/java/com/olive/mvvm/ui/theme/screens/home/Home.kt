package com.olive.mvvm.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.olive.mvvm.navigation.ROUTE_ABOUT
import com.olive.mvvm.navigation.ROUTE_HOME
import com.olive.mvvm.navigation.ROUTE_LOGIN
import com.olive.mvvm.navigation.ROUTE_REGISTRATION

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White))
    {
        Text(text = "WELCOME TO OUR APP...",
            color = Color.DarkGray,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif
        )

        Image(painter = painterResource(id = R.drawable.hourglass ),
            contentDescription = "time" )

        Spacer(modifier = Modifier.height(60.dp))
        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        },
            modifier = Modifier
                .width(300.dp),
                    colors = ButtonDefaults.buttonColors(Color.White),
            border = null
                ) {
            Text(text = "Sign in",
                color = Color.Magenta,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif)
        }
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {
            navController.navigate(ROUTE_REGISTRATION)
        },
            modifier = Modifier
                .width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.White),
            border = null) {
            Text(text = "Create an Account",
                color = Color.Gray)
        }}
}
@Preview
@Composable
private fun HomeScreenprev() {
    HomeScreen(navController = rememberNavController())

}