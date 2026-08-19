package com.awesomeapp.f136api

sealed class State219_9 {
    data object Loading : State219_9()
    data class Success(val data: String) : State219_9()
    data class Error(val message: String) : State219_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
