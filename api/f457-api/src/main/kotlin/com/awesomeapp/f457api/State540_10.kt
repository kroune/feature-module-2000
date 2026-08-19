package com.awesomeapp.f457api

sealed class State540_10 {
    data object Loading : State540_10()
    data class Success(val data: String) : State540_10()
    data class Error(val message: String) : State540_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
