package com.awesomeapp.f266impl

sealed class State988_7 {
    data object Loading : State988_7()
    data class Success(val data: String) : State988_7()
    data class Error(val message: String) : State988_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
