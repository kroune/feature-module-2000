package com.awesomeapp.f556api

sealed class State639_9 {
    data object Loading : State639_9()
    data class Success(val data: String) : State639_9()
    data class Error(val message: String) : State639_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
