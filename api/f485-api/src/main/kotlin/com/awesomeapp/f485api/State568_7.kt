package com.awesomeapp.f485api

sealed class State568_7 {
    data object Loading : State568_7()
    data class Success(val data: String) : State568_7()
    data class Error(val message: String) : State568_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
