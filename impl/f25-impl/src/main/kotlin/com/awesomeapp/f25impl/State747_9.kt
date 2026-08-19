package com.awesomeapp.f25impl

sealed class State747_9 {
    data object Loading : State747_9()
    data class Success(val data: String) : State747_9()
    data class Error(val message: String) : State747_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
