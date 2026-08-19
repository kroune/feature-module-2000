package com.awesomeapp.f280impl

sealed class State1002_9 {
    data object Loading : State1002_9()
    data class Success(val data: String) : State1002_9()
    data class Error(val message: String) : State1002_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
