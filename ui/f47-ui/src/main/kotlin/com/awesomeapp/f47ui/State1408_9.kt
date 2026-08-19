package com.awesomeapp.f47ui

sealed class State1408_9 {
    data object Loading : State1408_9()
    data class Success(val data: String) : State1408_9()
    data class Error(val message: String) : State1408_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
