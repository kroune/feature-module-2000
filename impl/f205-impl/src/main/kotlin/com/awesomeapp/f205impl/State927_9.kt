package com.awesomeapp.f205impl

sealed class State927_9 {
    data object Loading : State927_9()
    data class Success(val data: String) : State927_9()
    data class Error(val message: String) : State927_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
