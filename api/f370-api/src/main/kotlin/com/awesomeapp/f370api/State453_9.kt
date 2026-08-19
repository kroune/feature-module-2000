package com.awesomeapp.f370api

sealed class State453_9 {
    data object Loading : State453_9()
    data class Success(val data: String) : State453_9()
    data class Error(val message: String) : State453_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
