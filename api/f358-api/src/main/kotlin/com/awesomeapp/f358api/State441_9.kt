package com.awesomeapp.f358api

sealed class State441_9 {
    data object Loading : State441_9()
    data class Success(val data: String) : State441_9()
    data class Error(val message: String) : State441_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
