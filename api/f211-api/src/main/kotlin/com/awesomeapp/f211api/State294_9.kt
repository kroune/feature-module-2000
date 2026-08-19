package com.awesomeapp.f211api

sealed class State294_9 {
    data object Loading : State294_9()
    data class Success(val data: String) : State294_9()
    data class Error(val message: String) : State294_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
