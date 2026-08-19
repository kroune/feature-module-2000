package com.awesomeapp.f451impl

sealed class State1173_9 {
    data object Loading : State1173_9()
    data class Success(val data: String) : State1173_9()
    data class Error(val message: String) : State1173_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
