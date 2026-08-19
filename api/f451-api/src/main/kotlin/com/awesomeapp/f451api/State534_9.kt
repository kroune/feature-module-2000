package com.awesomeapp.f451api

sealed class State534_9 {
    data object Loading : State534_9()
    data class Success(val data: String) : State534_9()
    data class Error(val message: String) : State534_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
