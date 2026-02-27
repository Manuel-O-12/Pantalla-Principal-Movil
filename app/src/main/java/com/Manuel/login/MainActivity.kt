package com.Manuel.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.Manuel.login.ui.theme.LoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    LoginScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFF1E5BB2)),
        contentAlignment = Alignment.Center
    ) {

        Box(
            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(30.dp))
                .background(Color.White)
                .padding(24.dp)
        ) {

            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.height(5.dp))


                // Imagen del login arriba
                Image(
                    painter = painterResource(id = R.mipmap.login_foreground),
                    contentDescription = null,
                    modifier = Modifier
                        .height(300.dp)
                        .fillMaxWidth(),
                    /*.width(200.dp).height(150.dp),*/
                    contentScale = ContentScale.Fit
                )

                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = "Hello",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Welcome To Little Drop, where\nyou manage you daily tasks",
                    fontSize = 14.sp,
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(30.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(Color(0xFF1E5BB2)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Login",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Sign Up
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .clip(RoundedCornerShape(25.dp))
                        .background(Color.White)
                        .border(width = 2.dp, Color(0xFF1E5BB2), shape = RoundedCornerShape(25.dp)),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Sign Up",
                        color = Color(0xFF1E5BB2),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "Sign up using",
                    fontSize = 12.sp,
                    color = Color.Gray
                )

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        painter = painterResource(id = R.mipmap.facebook_foreground),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )

                    Image(
                        painter = painterResource(id = R.mipmap.googleplus_foreground),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )

                    Image(
                        painter = painterResource(id = R.mipmap.linkedi_foreground),
                        contentDescription = null,
                        modifier = Modifier.size(60.dp)
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))
            }
        }
    }
}