package com.awesomeapp.f605api

sealed class State688_10 {
    data object Loading : State688_10()
    data class Success(val data: String) : State688_10()
    data class Error(val message: String) : State688_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
