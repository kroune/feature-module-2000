package com.awesomeapp.f112ui

sealed class State1473_9 {
    data object Loading : State1473_9()
    data class Success(val data: String) : State1473_9()
    data class Error(val message: String) : State1473_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
