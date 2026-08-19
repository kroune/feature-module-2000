package com.awesomeapp.f551api

sealed class State634_8 {
    data object Loading : State634_8()
    data class Success(val data: String) : State634_8()
    data class Error(val message: String) : State634_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
