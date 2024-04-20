package com.example.composestudio.ui.screens.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.composestudio.model.getMedia
import com.example.composestudio.ui.common.Thumb
import com.example.composestudio.ui.screens.main.MainAppBar
import com.example.composestudio.ui.screens.main.MediaList

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(mediaId: Int) {
    val mediaItem = remember { getMedia().first { it.id == mediaId }}

    Scaffold(
        topBar = { TopAppBar(title = { Text(text = mediaItem.title )}) }
    ) { padding ->
        Box(modifier = Modifier.padding(padding)) {
            Thumb(mediaItem = mediaItem)
        }
    }
}