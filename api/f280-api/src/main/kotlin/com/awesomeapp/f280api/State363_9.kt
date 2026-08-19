package com.awesomeapp.f280api

sealed class State363_9 {
    data object Loading : State363_9()
    data class Success(val data: String) : State363_9()
    data class Error(val message: String) : State363_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
