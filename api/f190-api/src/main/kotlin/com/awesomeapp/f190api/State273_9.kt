package com.awesomeapp.f190api

sealed class State273_9 {
    data object Loading : State273_9()
    data class Success(val data: String) : State273_9()
    data class Error(val message: String) : State273_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
