package com.awesomeapp.f437api

sealed class State520_9 {
    data object Loading : State520_9()
    data class Success(val data: String) : State520_9()
    data class Error(val message: String) : State520_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
