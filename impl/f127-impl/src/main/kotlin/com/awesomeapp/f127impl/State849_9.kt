package com.awesomeapp.f127impl

sealed class State849_9 {
    data object Loading : State849_9()
    data class Success(val data: String) : State849_9()
    data class Error(val message: String) : State849_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
