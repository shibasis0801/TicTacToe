package com.example.samplecompose.tictactoe.ui.components.resultbar

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.height
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Preview
@Composable
fun ResultBar() {
    Surface(
        color = Color.LightGray,
        modifier = Modifier.height(36.dp)
    ) {
        Text(text = "RESULT COUNTER")
    }
}