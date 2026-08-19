package com.awesomeapp.f157api

sealed class State240_10 {
    data object Loading : State240_10()
    data class Success(val data: String) : State240_10()
    data class Error(val message: String) : State240_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
