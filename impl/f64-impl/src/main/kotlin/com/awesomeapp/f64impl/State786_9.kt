package com.awesomeapp.f64impl

sealed class State786_9 {
    data object Loading : State786_9()
    data class Success(val data: String) : State786_9()
    data class Error(val message: String) : State786_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
