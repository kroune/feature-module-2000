package com.awesomeapp.f187impl

sealed class State909_9 {
    data object Loading : State909_9()
    data class Success(val data: String) : State909_9()
    data class Error(val message: String) : State909_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
