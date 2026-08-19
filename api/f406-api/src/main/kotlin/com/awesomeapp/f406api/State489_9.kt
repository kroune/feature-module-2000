package com.awesomeapp.f406api

sealed class State489_9 {
    data object Loading : State489_9()
    data class Success(val data: String) : State489_9()
    data class Error(val message: String) : State489_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
