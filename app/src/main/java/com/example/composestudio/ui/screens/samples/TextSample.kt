package com.example.composestudio.ui.screens.samples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

@Composable
fun TextSample() {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Text(
            text = "First Greeting", // stringResource(id = R.string.greeting),
            fontSize = 25.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 2.sp,
            textDecoration = TextDecoration.LineThrough,
            textAlign = TextAlign.Center,
            lineHeight = 1.em,
            overflow = TextOverflow.Clip
        )
        Text(
            text = "First Greeting", // stringResource(id = R.string.greeting),
            style = MaterialTheme.typography.headlineLarge.copy(
                shadow = Shadow(
                    offset = Offset(10f, 10f),
                    blurRadius = 10f,
                    color = Color.Black.copy(alpha = 0.5f)
                )
            )
        )
    }
}