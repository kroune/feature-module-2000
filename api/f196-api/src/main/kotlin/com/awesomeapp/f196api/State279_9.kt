package com.awesomeapp.f196api

sealed class State279_9 {
    data object Loading : State279_9()
    data class Success(val data: String) : State279_9()
    data class Error(val message: String) : State279_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
