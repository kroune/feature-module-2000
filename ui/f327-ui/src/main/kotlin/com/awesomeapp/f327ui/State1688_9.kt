package com.awesomeapp.f327ui

sealed class State1688_9 {
    data object Loading : State1688_9()
    data class Success(val data: String) : State1688_9()
    data class Error(val message: String) : State1688_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
