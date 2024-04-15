package com.olive.mvvm.ui.theme.screens.login

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.olive.mvvm.MainActivity
import androidx.compose.material3.Icon as Icon

@Composable
fun LogInScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context= LocalContext.current
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White))

    {
        Text(text = "Welcome Back",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif)
        Text(text = "Login into your Account",
            fontSize = 18.sp,
            fontFamily = FontFamily.Cursive)

        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "icon" ) },
            label = { Text(text = "User Name/Email",
                color = Color.DarkGray,
                fontSize = 20.sp)
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.fillMaxWidth())
        OutlinedTextField(
            value = password,
            onValueChange = {password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "icon" ) },
            label = { Text(text = "Password",
                color = Color.DarkGray,
                fontSize = 20.sp)
            },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(onClick = {
            val intent= Intent(context, MainActivity::class.java)
            context.startActivity(intent)
        },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Blue),
            border = null) {
            Text(text = "Login",
                color = Color.White,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif)
    }
    Spacer(modifier = Modifier.height(15.dp))
    OutlinedButton(onClick = {
        val intent= Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    },
        modifier = Modifier
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(Color.White),
        border = null) {
        Text(
            text = "Don't have an Account yet?",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.DarkGray
        )

        Modifier.padding(10.dp)

        Text(
            text = "Sign up",
            fontSize = 20.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.DarkGray)
    }
    }
}



@Preview
@Composable
private fun LogInprev() {
    LogInScreen(navController = rememberNavController())
}