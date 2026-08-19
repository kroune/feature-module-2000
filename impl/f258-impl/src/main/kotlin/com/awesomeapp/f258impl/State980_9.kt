package com.awesomeapp.f258impl

sealed class State980_9 {
    data object Loading : State980_9()
    data class Success(val data: String) : State980_9()
    data class Error(val message: String) : State980_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
