package com.awesomeapp.f235impl

sealed class State957_9 {
    data object Loading : State957_9()
    data class Success(val data: String) : State957_9()
    data class Error(val message: String) : State957_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
