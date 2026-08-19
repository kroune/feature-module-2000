package com.awesomeapp.f86impl

sealed class State808_7 {
    data object Loading : State808_7()
    data class Success(val data: String) : State808_7()
    data class Error(val message: String) : State808_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
