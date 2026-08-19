package com.awesomeapp.f19impl

sealed class State741_9 {
    data object Loading : State741_9()
    data class Success(val data: String) : State741_9()
    data class Error(val message: String) : State741_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
