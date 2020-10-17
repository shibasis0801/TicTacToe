package com.example.samplecompose.tictactoe.logic.data

enum class Option {
    X, O, BLANK;

    // Testing only
    fun switcher() = when(this) {
        X -> O
        O -> X
        BLANK -> X
    }

    override fun toString() = when(this) {
        X, O -> this.name
        BLANK -> " "
    }
}


enum class Player {
    ONE, TWO;

    fun toggle() = when(this) {
        ONE -> TWO
        TWO -> ONE
    }

    fun option() = when(this) {
        ONE -> Option.X
        TWO -> Option.O
    }
}
