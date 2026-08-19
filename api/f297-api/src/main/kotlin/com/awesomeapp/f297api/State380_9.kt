package com.awesomeapp.f297api

sealed class State380_9 {
    data object Loading : State380_9()
    data class Success(val data: String) : State380_9()
    data class Error(val message: String) : State380_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
