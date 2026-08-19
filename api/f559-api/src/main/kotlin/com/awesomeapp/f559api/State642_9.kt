package com.awesomeapp.f559api

sealed class State642_9 {
    data object Loading : State642_9()
    data class Success(val data: String) : State642_9()
    data class Error(val message: String) : State642_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
