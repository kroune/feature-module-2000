package com.awesomeapp.f604impl

sealed class State1326_9 {
    data object Loading : State1326_9()
    data class Success(val data: String) : State1326_9()
    data class Error(val message: String) : State1326_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
