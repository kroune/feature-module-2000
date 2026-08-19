package com.awesomeapp.f162api

sealed class State245_10 {
    data object Loading : State245_10()
    data class Success(val data: String) : State245_10()
    data class Error(val message: String) : State245_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
