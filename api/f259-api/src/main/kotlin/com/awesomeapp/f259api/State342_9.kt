package com.awesomeapp.f259api

sealed class State342_9 {
    data object Loading : State342_9()
    data class Success(val data: String) : State342_9()
    data class Error(val message: String) : State342_9()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
