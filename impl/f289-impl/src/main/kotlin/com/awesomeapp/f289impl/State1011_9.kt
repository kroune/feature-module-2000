package com.awesomeapp.f289impl

sealed class State1011_9 {
    data object Loading : State1011_9()
    data class Success(val data: String) : State1011_9()
    data class Error(val message: String) : State1011_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
