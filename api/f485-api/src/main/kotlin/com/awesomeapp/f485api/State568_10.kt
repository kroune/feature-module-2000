package com.awesomeapp.f485api

sealed class State568_10 {
    data object Loading : State568_10()
    data class Success(val data: String) : State568_10()
    data class Error(val message: String) : State568_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
