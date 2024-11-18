package com.example.bunga.ui.route

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.bunga.model.Bunga

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailRoute(
    onBackStack: () -> Unit,
    id: Int?
) {
    val bunga = id?.let { Bunga.getBungaById(id) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Detail",
                        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = onBackStack
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (bunga != null) {
                Image(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth()
                        .height(400.dp)
                        .shadow(4.dp, RoundedCornerShape(16.dp), true),
                    painter = painterResource(id = id),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = bunga.name,
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = bunga.description,
                    style = MaterialTheme.typography.bodyLarge
                )
            } else {
                Text(text = "No data")
            }
        }
    }
}