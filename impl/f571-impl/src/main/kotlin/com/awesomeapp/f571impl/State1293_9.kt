package com.awesomeapp.f571impl

sealed class State1293_9 {
    data object Loading : State1293_9()
    data class Success(val data: String) : State1293_9()
    data class Error(val message: String) : State1293_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
