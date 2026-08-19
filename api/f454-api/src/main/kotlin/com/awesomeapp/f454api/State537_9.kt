package com.awesomeapp.f454api

sealed class State537_9 {
    data object Loading : State537_9()
    data class Success(val data: String) : State537_9()
    data class Error(val message: String) : State537_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
