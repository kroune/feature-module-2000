package com.awesomeapp.f478impl

sealed class State1200_9 {
    data object Loading : State1200_9()
    data class Success(val data: String) : State1200_9()
    data class Error(val message: String) : State1200_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
