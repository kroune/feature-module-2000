package com.awesomeapp.f199api

sealed class State282_9 {
    data object Loading : State282_9()
    data class Success(val data: String) : State282_9()
    data class Error(val message: String) : State282_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
