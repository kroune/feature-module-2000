package com.awesomeapp.f63ui

sealed class State1424_9 {
    data object Loading : State1424_9()
    data class Success(val data: String) : State1424_9()
    data class Error(val message: String) : State1424_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
