package com.awesomeapp.f18impl

sealed class State740_9 {
    data object Loading : State740_9()
    data class Success(val data: String) : State740_9()
    data class Error(val message: String) : State740_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
