package com.awesomeapp.f106api

sealed class State189_9 {
    data object Loading : State189_9()
    data class Success(val data: String) : State189_9()
    data class Error(val message: String) : State189_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
