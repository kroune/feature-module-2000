package com.awesomeapp.f151impl

sealed class State873_9 {
    data object Loading : State873_9()
    data class Success(val data: String) : State873_9()
    data class Error(val message: String) : State873_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
