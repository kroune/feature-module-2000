package com.awesomeapp.f211impl

sealed class State933_9 {
    data object Loading : State933_9()
    data class Success(val data: String) : State933_9()
    data class Error(val message: String) : State933_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
