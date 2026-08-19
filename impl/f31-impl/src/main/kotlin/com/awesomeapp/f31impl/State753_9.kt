package com.awesomeapp.f31impl

sealed class State753_9 {
    data object Loading : State753_9()
    data class Success(val data: String) : State753_9()
    data class Error(val message: String) : State753_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
