package com.awesomeapp.f113impl

sealed class State835_7 {
    data object Loading : State835_7()
    data class Success(val data: String) : State835_7()
    data class Error(val message: String) : State835_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
