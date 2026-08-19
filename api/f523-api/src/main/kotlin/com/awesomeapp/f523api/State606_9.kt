package com.awesomeapp.f523api

sealed class State606_9 {
    data object Loading : State606_9()
    data class Success(val data: String) : State606_9()
    data class Error(val message: String) : State606_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
