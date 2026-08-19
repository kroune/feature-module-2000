package com.awesomeapp.f597api

sealed class State680_9 {
    data object Loading : State680_9()
    data class Success(val data: String) : State680_9()
    data class Error(val message: String) : State680_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
