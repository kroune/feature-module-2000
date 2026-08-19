package com.awesomeapp.f616api

sealed class State699_9 {
    data object Loading : State699_9()
    data class Success(val data: String) : State699_9()
    data class Error(val message: String) : State699_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
