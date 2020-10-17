package com.example.samplecompose.tictactoe.ui.components.board

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.ui.tooling.preview.Preview
import com.example.samplecompose.tictactoe.logic.data.Option
import com.example.samplecompose.tictactoe.logic.data.Player
import com.example.samplecompose.tictactoe.logic.transform.getResult
import com.example.samplecompose.tictactoe.ui.components.board.subcomponents.Square
import com.example.samplecompose.tictactoe.transform.createMatrix

@Preview
@Composable
fun Board() {
    val (state, setState) = remember {
        mutableStateOf(
            createMatrix(3, 3, Option.BLANK)
        )
    }

    val (player, setPlayer) = remember {
        mutableStateOf(Player.ONE)
    }

    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalGravity = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
    ) {
        state.forEachIndexed { row, data ->
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                data.forEachIndexed { col, value ->
                    Square(text = value.toString(), default = Option.BLANK.toString()) {
                        val newState = state.clone()

                        val newResult = getResult(newState[row][col], player);
                        if (newResult != newState[row][col]) {
                            newState[row][col] = newResult
                            setPlayer(player.toggle())
                            setState(newState)
                        }
                    }
                }
            }
        }
    }
}