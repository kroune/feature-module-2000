package com.awesomeapp.f446impl

sealed class State1168_9 {
    data object Loading : State1168_9()
    data class Success(val data: String) : State1168_9()
    data class Error(val message: String) : State1168_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
