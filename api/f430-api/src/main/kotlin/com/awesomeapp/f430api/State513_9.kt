package com.awesomeapp.f430api

sealed class State513_9 {
    data object Loading : State513_9()
    data class Success(val data: String) : State513_9()
    data class Error(val message: String) : State513_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
