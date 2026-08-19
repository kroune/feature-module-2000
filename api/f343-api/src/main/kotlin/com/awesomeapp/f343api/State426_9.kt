package com.awesomeapp.f343api

sealed class State426_9 {
    data object Loading : State426_9()
    data class Success(val data: String) : State426_9()
    data class Error(val message: String) : State426_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
