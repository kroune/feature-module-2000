package com.awesomeapp.f208api

sealed class State291_9 {
    data object Loading : State291_9()
    data class Success(val data: String) : State291_9()
    data class Error(val message: String) : State291_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
