package com.awesomeapp.f217impl

sealed class State939_9 {
    data object Loading : State939_9()
    data class Success(val data: String) : State939_9()
    data class Error(val message: String) : State939_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
