package com.awesomeapp.f268api

sealed class State351_9 {
    data object Loading : State351_9()
    data class Success(val data: String) : State351_9()
    data class Error(val message: String) : State351_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
