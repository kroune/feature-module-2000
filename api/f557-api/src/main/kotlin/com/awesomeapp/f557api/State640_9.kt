package com.awesomeapp.f557api

sealed class State640_9 {
    data object Loading : State640_9()
    data class Success(val data: String) : State640_9()
    data class Error(val message: String) : State640_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
