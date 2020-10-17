package com.example.samplecompose.tictactoe.ui.components.board.subcomponents

import android.util.Log
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview


@Composable
fun Square(text: String, default: String = "", onClick: () -> Unit = {}) {
    OutlinedButton(
        shape = RectangleShape,
        modifier = Modifier
            .size(128.dp),
        onClick = onClick
    ) {
        Text(
            text = text,
            style = TextStyle(fontSize = TextUnit.Sp(24), fontWeight =  FontWeight.Bold, textAlign = TextAlign.Center),
        )
    }
}

@Preview
@Composable
fun DemoSquare() {
    Square(text = "X") {
        Log.d("DemoSquare", "X")
    }
}