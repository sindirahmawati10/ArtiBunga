package com.example.bunga.ui.route

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.bunga.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutRoute() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "About",
                        style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Bold)
                    )
                },
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(180.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "User",
                contentScale = ContentScale.Crop
            )
            Text(text = "Sindi Rahma Wati", style = MaterialTheme.typography.titleLarge)
            Text(text = "sindi.22047@mhs.unesa.ac.id", style = MaterialTheme.typography.titleMedium)
            Row(
                modifier = Modifier
                    .padding(top = 32.dp)
                    .fillMaxWidth()
                    .shadow(2.dp, RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colorScheme.background)
                    .padding(32.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(80.dp),
                    painter = painterResource(id = R.drawable.universitas_negeri_surabaya_logo),
                    contentDescription = "Github",
                    contentScale = ContentScale.Crop
                )
                Column(
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(text = "Universitas Negeri Surabaya", style = MaterialTheme.typography.titleLarge)
                    Text(text = "Desain Kounikasi Visual", style = MaterialTheme.typography.titleMedium)
                }
            }
        }
    }
}