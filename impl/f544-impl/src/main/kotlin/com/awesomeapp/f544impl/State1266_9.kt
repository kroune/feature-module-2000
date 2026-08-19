package com.awesomeapp.f544impl

sealed class State1266_9 {
    data object Loading : State1266_9()
    data class Success(val data: String) : State1266_9()
    data class Error(val message: String) : State1266_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
