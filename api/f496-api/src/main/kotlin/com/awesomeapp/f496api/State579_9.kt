package com.awesomeapp.f496api

sealed class State579_9 {
    data object Loading : State579_9()
    data class Success(val data: String) : State579_9()
    data class Error(val message: String) : State579_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
