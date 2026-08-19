package com.awesomeapp.f49impl

sealed class State771_9 {
    data object Loading : State771_9()
    data class Success(val data: String) : State771_9()
    data class Error(val message: String) : State771_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
