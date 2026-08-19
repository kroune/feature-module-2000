package com.awesomeapp.f130api

sealed class State213_9 {
    data object Loading : State213_9()
    data class Success(val data: String) : State213_9()
    data class Error(val message: String) : State213_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
