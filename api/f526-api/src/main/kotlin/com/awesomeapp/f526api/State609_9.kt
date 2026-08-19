package com.awesomeapp.f526api

sealed class State609_9 {
    data object Loading : State609_9()
    data class Success(val data: String) : State609_9()
    data class Error(val message: String) : State609_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
