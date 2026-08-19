package com.awesomeapp.f160impl

sealed class State882_9 {
    data object Loading : State882_9()
    data class Success(val data: String) : State882_9()
    data class Error(val message: String) : State882_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
