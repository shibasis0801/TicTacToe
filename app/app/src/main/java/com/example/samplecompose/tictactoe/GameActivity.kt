package com.example.samplecompose.tictactoe

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.setContent
import com.example.samplecompose.tictactoe.theme.SamplecomposeTheme
import com.example.samplecompose.tictactoe.ui.MainUI
import com.example.samplecompose.tictactoe.ui.components.board.Board

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SamplecomposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainUI()
                }
            }
        }
    }
}