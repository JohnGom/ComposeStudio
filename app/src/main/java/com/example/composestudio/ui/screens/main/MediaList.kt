package com.example.composestudio.ui.screens.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.composestudio.R
import com.example.composestudio.model.MediaItem
import com.example.composestudio.model.getMedia
import com.example.composestudio.ui.common.Thumb

@Composable
fun MediaList(onDetail: (String) -> Unit, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(dimensionResource(id = R.dimen.padding_xsmall)),
        columns = GridCells.Adaptive(dimensionResource(id = R.dimen.cell_min_wedith)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_xsmall)),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(id = R.dimen.padding_xsmall)),
        modifier = modifier
    ) {
        items(getMedia()) { item ->
            MediaItemList(item, onDetail)
        }
    }
}

@Composable
fun MediaItemList(item: MediaItem, onDetail: (String) -> Unit) {
    Card(
        modifier = Modifier.background(color = MaterialTheme.colorScheme.primary ).clickable { onDetail.invoke("detail/${item.id}") },
        elevation = CardDefaults.cardElevation(0.dp),
        border = BorderStroke(1.dp, Color.LightGray)
    ) {
        Column {
            Thumb(item)
            Title(item)
        }
    }
}

@Composable
private fun Title(item: MediaItem) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            //.background(MaterialTheme.colorScheme.secondary)
            .padding(dimensionResource(id = R.dimen.padding_medium))
    ) {
        Text(text = item.title, style = MaterialTheme.typography.headlineSmall)
    }
}