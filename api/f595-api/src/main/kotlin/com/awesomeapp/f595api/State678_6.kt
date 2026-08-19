package com.awesomeapp.f595api

sealed class State678_6 {
    data object Loading : State678_6()
    data class Success(val data: String) : State678_6()
    data class Error(val message: String) : State678_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
