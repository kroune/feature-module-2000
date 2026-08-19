package com.awesomeapp.f290impl

sealed class State1012_9 {
    data object Loading : State1012_9()
    data class Success(val data: String) : State1012_9()
    data class Error(val message: String) : State1012_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
