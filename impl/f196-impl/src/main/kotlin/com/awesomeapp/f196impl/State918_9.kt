package com.awesomeapp.f196impl

sealed class State918_9 {
    data object Loading : State918_9()
    data class Success(val data: String) : State918_9()
    data class Error(val message: String) : State918_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
