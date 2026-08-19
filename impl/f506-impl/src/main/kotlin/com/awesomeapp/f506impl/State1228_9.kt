package com.awesomeapp.f506impl

sealed class State1228_9 {
    data object Loading : State1228_9()
    data class Success(val data: String) : State1228_9()
    data class Error(val message: String) : State1228_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
