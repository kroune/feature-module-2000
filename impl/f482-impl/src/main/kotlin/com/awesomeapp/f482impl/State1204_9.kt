package com.awesomeapp.f482impl

sealed class State1204_9 {
    data object Loading : State1204_9()
    data class Success(val data: String) : State1204_9()
    data class Error(val message: String) : State1204_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
