package com.awesomeapp.f494api

sealed class State577_5 {
    data object Loading : State577_5()
    data class Success(val data: String) : State577_5()
    data class Error(val message: String) : State577_5()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
