package com.example.samplecompose.tictactoe.transform

inline fun<reified T> createMatrix(rows: Int, cols: Int, default: T): Array<Array<T>> {
    return Array(rows) { Array(cols) { default } }
}