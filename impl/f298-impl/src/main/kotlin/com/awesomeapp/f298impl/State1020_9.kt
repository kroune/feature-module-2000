package com.awesomeapp.f298impl

sealed class State1020_9 {
    data object Loading : State1020_9()
    data class Success(val data: String) : State1020_9()
    data class Error(val message: String) : State1020_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
