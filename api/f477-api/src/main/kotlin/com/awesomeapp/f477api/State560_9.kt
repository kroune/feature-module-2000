package com.awesomeapp.f477api

sealed class State560_9 {
    data object Loading : State560_9()
    data class Success(val data: String) : State560_9()
    data class Error(val message: String) : State560_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
