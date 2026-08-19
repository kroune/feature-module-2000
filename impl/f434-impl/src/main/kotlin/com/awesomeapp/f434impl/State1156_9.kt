package com.awesomeapp.f434impl

sealed class State1156_9 {
    data object Loading : State1156_9()
    data class Success(val data: String) : State1156_9()
    data class Error(val message: String) : State1156_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
