package com.awesomeapp.f257api

sealed class State340_9 {
    data object Loading : State340_9()
    data class Success(val data: String) : State340_9()
    data class Error(val message: String) : State340_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
