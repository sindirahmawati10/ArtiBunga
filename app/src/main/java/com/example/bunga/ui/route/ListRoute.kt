package com.example.bunga.ui.route

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.bunga.model.Bunga

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListRoute(
    toDetail: (Int) -> Unit
) {
    var search by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "List Bunga",
                        style = MaterialTheme.typography.headlineLarge.copy(fontWeight = FontWeight.Bold)
                    )
                },
            )
        }
    ){ innerPadding ->
        LazyVerticalGrid(
            modifier = Modifier.padding(innerPadding).padding(horizontal = 16.dp).padding(top = 16.dp),
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(bottom = 128.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item(span = { GridItemSpan(maxLineSpan) }) {
                OutlinedTextField(
                    value = search,
                    onValueChange = {
                        search = it
                    },
                    placeholder = {
                        Text("Search")
                    },
                    leadingIcon = {
                        Icon(Icons.Default.Search, contentDescription = null)
                    },
                    singleLine = true
                )
            }
            items(
                items = when(search) {
                    "" -> Bunga.list
                    else -> Bunga.list.filter { bunga -> bunga.name.lowercase().contains(search) }
                }
            ) { item ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            toDetail(item.image)
                        },
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Image(
                        painter = painterResource(id = item.image),
                        contentDescription = "Bunga",
                        modifier = Modifier
                            .height(240.dp)
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(16.dp)),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = item.name,
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
        }
    }
}