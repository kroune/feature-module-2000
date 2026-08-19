package com.awesomeapp.f397impl

sealed class State1119_9 {
    data object Loading : State1119_9()
    data class Success(val data: String) : State1119_9()
    data class Error(val message: String) : State1119_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
