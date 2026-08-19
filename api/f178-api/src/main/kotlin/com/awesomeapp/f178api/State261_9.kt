package com.awesomeapp.f178api

sealed class State261_9 {
    data object Loading : State261_9()
    data class Success(val data: String) : State261_9()
    data class Error(val message: String) : State261_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
