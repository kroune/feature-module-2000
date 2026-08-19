package com.awesomeapp.f61impl

sealed class State783_9 {
    data object Loading : State783_9()
    data class Success(val data: String) : State783_9()
    data class Error(val message: String) : State783_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
