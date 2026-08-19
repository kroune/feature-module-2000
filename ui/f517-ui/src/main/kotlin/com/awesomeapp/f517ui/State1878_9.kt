package com.awesomeapp.f517ui

sealed class State1878_9 {
    data object Loading : State1878_9()
    data class Success(val data: String) : State1878_9()
    data class Error(val message: String) : State1878_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
