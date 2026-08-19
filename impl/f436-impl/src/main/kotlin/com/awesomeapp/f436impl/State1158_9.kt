package com.awesomeapp.f436impl

sealed class State1158_9 {
    data object Loading : State1158_9()
    data class Success(val data: String) : State1158_9()
    data class Error(val message: String) : State1158_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
