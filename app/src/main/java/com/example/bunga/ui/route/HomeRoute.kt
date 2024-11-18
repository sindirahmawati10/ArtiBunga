package com.example.bunga.ui.route

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.bunga.model.Bunga

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeRoute(
    toDetail: (Int) -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Home",
                        style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Bold)
                    )
                },
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(top = 16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(bottom = 128.dp)
        ) {
            item {
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = "Popular",
                    style = MaterialTheme.typography.headlineSmall
                        .copy(fontWeight = FontWeight.Bold)
                )
            }
            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(16.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    items(items = Bunga.popularList) { item ->
                        Column(
                            modifier = Modifier
                                .width(130.dp)
                                .clickable {
                                    toDetail(item.image)
                                },
                        ) {
                            Image(
                                painter = painterResource(id = item.image),
                                contentDescription = "Anime",
                                modifier = Modifier
                                    .size(
                                        width = 130.dp,
                                        height = 180.dp
                                    )
                                    .clip(RoundedCornerShape(16.dp)),
                                contentScale = ContentScale.Crop
                            )
                            Text(
                                modifier = Modifier.padding(top = 8.dp),
                                text = item.name,
                                style = MaterialTheme.typography.bodyMedium
                            )
                        }
                    }
                }
            }
            item {
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = "Favorite",
                    style = MaterialTheme.typography.headlineSmall
                        .copy(fontWeight = FontWeight.Bold)
                )
            }
            items(items = Bunga.favoriteList) { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .clickable {
                            toDetail(item.image)
                        },
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    Image(
                        painter = painterResource(id = item.image),
                        contentDescription = "Bunga",
                        modifier = Modifier
                            .size(
                                width = 130.dp,
                                height = 180.dp
                            )
                            .clip(RoundedCornerShape(16.dp)),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = item.name,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }
        }
    }
}