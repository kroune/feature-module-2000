package com.awesomeapp.f217impl

sealed class State939_6 {
    data object Loading : State939_6()
    data class Success(val data: String) : State939_6()
    data class Error(val message: String) : State939_6()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
