package com.example.samplecompose.tictactoe.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.ui.tooling.preview.Preview
import com.example.samplecompose.tictactoe.ui.components.board.Board
import com.example.samplecompose.tictactoe.ui.components.resultbar.ResultBar

@Preview
@Composable
fun MainUI() {
    Column {
        ResultBar()
        Board()
    }
}