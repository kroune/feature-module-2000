package com.awesomeapp.f538api

sealed class State621_9 {
    data object Loading : State621_9()
    data class Success(val data: String) : State621_9()
    data class Error(val message: String) : State621_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
