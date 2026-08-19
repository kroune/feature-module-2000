package com.awesomeapp.f160api

sealed class State243_9 {
    data object Loading : State243_9()
    data class Success(val data: String) : State243_9()
    data class Error(val message: String) : State243_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
