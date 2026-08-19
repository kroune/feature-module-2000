package com.awesomeapp.f244api

sealed class State327_9 {
    data object Loading : State327_9()
    data class Success(val data: String) : State327_9()
    data class Error(val message: String) : State327_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
