package com.awesomeapp.f171ui

sealed class State1532_9 {
    data object Loading : State1532_9()
    data class Success(val data: String) : State1532_9()
    data class Error(val message: String) : State1532_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
