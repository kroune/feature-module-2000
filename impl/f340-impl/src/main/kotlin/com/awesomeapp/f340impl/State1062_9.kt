package com.awesomeapp.f340impl

sealed class State1062_9 {
    data object Loading : State1062_9()
    data class Success(val data: String) : State1062_9()
    data class Error(val message: String) : State1062_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
