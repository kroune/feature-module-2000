package com.awesomeapp.f218impl

sealed class State940_9 {
    data object Loading : State940_9()
    data class Success(val data: String) : State940_9()
    data class Error(val message: String) : State940_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
