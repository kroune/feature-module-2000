package com.awesomeapp.f358impl

sealed class State1080_9 {
    data object Loading : State1080_9()
    data class Success(val data: String) : State1080_9()
    data class Error(val message: String) : State1080_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
