package com.example.samplecompose.tictactoe.logic.transform

import com.example.samplecompose.tictactoe.logic.data.Option
import com.example.samplecompose.tictactoe.logic.data.Option.*
import com.example.samplecompose.tictactoe.logic.data.Player
import com.example.samplecompose.tictactoe.logic.data.Player.*

fun getResult(currentValue: Option, player: Player) = when(currentValue) {
    X, O -> currentValue
    BLANK -> player.option()
}