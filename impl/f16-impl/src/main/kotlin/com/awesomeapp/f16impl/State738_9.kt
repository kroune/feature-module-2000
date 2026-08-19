package com.awesomeapp.f16impl

sealed class State738_9 {
    data object Loading : State738_9()
    data class Success(val data: String) : State738_9()
    data class Error(val message: String) : State738_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
