package com.example.composestudio.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.example.composestudio.R
import com.example.composestudio.model.MediaItem

@OptIn(ExperimentalCoilApi::class)
@Composable
fun Thumb(mediaItem: MediaItem) {
    Box(
        modifier = Modifier
            .height(dimensionResource(id = R.dimen.cell_thumb_height))
            .fillMaxWidth()
    ) {
        Image(
            painter = rememberImagePainter(
                data = mediaItem.thumb,
            ),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        if (mediaItem.type == MediaItem.Type.VIDEO) {
            Icon(
                imageVector = Icons.Default.PlayCircleOutline,
                contentDescription = null,
                modifier = Modifier
                    .size(dimensionResource(id = R.dimen.cell_play_icon_size))
                    .align(Alignment.Center),
                tint = Color.White
            )
        }
    }
}