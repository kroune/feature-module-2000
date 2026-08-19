package com.awesomeapp.f167api

sealed class State250_10 {
    data object Loading : State250_10()
    data class Success(val data: String) : State250_10()
    data class Error(val message: String) : State250_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
