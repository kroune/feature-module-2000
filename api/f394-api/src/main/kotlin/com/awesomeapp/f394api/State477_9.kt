package com.awesomeapp.f394api

sealed class State477_9 {
    data object Loading : State477_9()
    data class Success(val data: String) : State477_9()
    data class Error(val message: String) : State477_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
