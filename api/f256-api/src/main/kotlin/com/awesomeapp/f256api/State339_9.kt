package com.awesomeapp.f256api

sealed class State339_9 {
    data object Loading : State339_9()
    data class Success(val data: String) : State339_9()
    data class Error(val message: String) : State339_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
