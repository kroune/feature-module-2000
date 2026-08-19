package com.awesomeapp.f397ui

sealed class State1758_9 {
    data object Loading : State1758_9()
    data class Success(val data: String) : State1758_9()
    data class Error(val message: String) : State1758_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
