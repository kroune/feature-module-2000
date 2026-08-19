package com.awesomeapp.f199impl

sealed class State921_9 {
    data object Loading : State921_9()
    data class Success(val data: String) : State921_9()
    data class Error(val message: String) : State921_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
