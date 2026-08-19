package com.awesomeapp.f637api

sealed class State720_10 {
    data object Loading : State720_10()
    data class Success(val data: String) : State720_10()
    data class Error(val message: String) : State720_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
