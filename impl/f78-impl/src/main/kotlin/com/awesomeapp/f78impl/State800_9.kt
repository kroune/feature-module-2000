package com.awesomeapp.f78impl

sealed class State800_9 {
    data object Loading : State800_9()
    data class Success(val data: String) : State800_9()
    data class Error(val message: String) : State800_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
