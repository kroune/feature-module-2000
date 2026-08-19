package com.awesomeapp.f432api

sealed class State515_7 {
    data object Loading : State515_7()
    data class Success(val data: String) : State515_7()
    data class Error(val message: String) : State515_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
