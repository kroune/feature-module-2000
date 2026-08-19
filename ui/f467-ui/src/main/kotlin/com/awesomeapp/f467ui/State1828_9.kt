package com.awesomeapp.f467ui

sealed class State1828_9 {
    data object Loading : State1828_9()
    data class Success(val data: String) : State1828_9()
    data class Error(val message: String) : State1828_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
