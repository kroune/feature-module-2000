package com.awesomeapp.f138impl

sealed class State860_9 {
    data object Loading : State860_9()
    data class Success(val data: String) : State860_9()
    data class Error(val message: String) : State860_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
