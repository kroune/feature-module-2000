package com.awesomeapp.f629api

sealed class State712_10 {
    data object Loading : State712_10()
    data class Success(val data: String) : State712_10()
    data class Error(val message: String) : State712_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
