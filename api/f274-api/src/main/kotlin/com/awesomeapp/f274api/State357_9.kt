package com.awesomeapp.f274api

sealed class State357_9 {
    data object Loading : State357_9()
    data class Success(val data: String) : State357_9()
    data class Error(val message: String) : State357_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
