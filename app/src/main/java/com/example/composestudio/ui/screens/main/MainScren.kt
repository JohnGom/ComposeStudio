package com.example.composestudio.ui.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(onDetail: (String) -> Unit) {
    Scaffold(
        topBar = { MainAppBar() },
    ) { padding ->
        MediaList(onDetail, modifier = Modifier.padding(padding))
    }
}