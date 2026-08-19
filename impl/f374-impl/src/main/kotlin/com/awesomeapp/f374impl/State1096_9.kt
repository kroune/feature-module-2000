package com.awesomeapp.f374impl

sealed class State1096_9 {
    data object Loading : State1096_9()
    data class Success(val data: String) : State1096_9()
    data class Error(val message: String) : State1096_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
