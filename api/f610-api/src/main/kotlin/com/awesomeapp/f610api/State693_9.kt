package com.awesomeapp.f610api

sealed class State693_9 {
    data object Loading : State693_9()
    data class Success(val data: String) : State693_9()
    data class Error(val message: String) : State693_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
