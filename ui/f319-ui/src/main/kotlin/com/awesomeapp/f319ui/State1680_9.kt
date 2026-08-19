package com.awesomeapp.f319ui

sealed class State1680_9 {
    data object Loading : State1680_9()
    data class Success(val data: String) : State1680_9()
    data class Error(val message: String) : State1680_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
