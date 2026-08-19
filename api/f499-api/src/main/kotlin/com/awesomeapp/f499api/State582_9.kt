package com.awesomeapp.f499api

sealed class State582_9 {
    data object Loading : State582_9()
    data class Success(val data: String) : State582_9()
    data class Error(val message: String) : State582_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
