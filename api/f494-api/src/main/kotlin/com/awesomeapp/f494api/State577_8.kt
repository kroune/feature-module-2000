package com.awesomeapp.f494api

sealed class State577_8 {
    data object Loading : State577_8()
    data class Success(val data: String) : State577_8()
    data class Error(val message: String) : State577_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
