package com.awesomeapp.f223api

sealed class State306_9 {
    data object Loading : State306_9()
    data class Success(val data: String) : State306_9()
    data class Error(val message: String) : State306_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
