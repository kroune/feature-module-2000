package com.awesomeapp.f110impl

sealed class State832_7 {
    data object Loading : State832_7()
    data class Success(val data: String) : State832_7()
    data class Error(val message: String) : State832_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
