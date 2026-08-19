package com.awesomeapp.f551api

sealed class State634_5 {
    data object Loading : State634_5()
    data class Success(val data: String) : State634_5()
    data class Error(val message: String) : State634_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
