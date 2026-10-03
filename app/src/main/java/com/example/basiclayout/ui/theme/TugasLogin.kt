package com.example.basiclayout.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiclayout.R

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "WELCOME",
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF4DD0E1),
                letterSpacing = 2.sp
            )

            Text(
                text = "Selamat datang, Rafi",
                fontSize = 16.sp,
                color = Color.LightGray,
            )

            Spacer(modifier = Modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.drawable.logo1),
                contentDescription = "Logo",
                modifier = Modifier.size(100.dp),
            )

            Spacer(modifier = Modifier.height(40.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(24.dp))
                    .background(Color.Black.copy(alpha = 0.5f))
                    .border(1.dp, Color.White.copy(alpha = 0.2f), RoundedCornerShape(24.dp))
                    .padding(vertical = 30.dp, horizontal = 20.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                )

                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Profile Picture",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(160.dp) // Ukuran sedikit diperkecil agar pas di dalam kartu
                        .clip(CircleShape)
                        .border(
                            3.dp,
                            Color(0xFF4DD0E1),
                            CircleShape
                        ), // Border menyesuaikan warna tema
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    text = "PLAYER NAME",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.LightGray,
                    letterSpacing = 1.5.sp
                )

                Text(
                    text = "Rafi Ammar Dinata",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "ID: 20240140027",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFFFFD54F),
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    BasicLayoutTheme {
        LoginScreen()
    }
}

