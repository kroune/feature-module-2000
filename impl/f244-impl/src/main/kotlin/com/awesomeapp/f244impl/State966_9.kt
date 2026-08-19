package com.awesomeapp.f244impl

sealed class State966_9 {
    data object Loading : State966_9()
    data class Success(val data: String) : State966_9()
    data class Error(val message: String) : State966_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
