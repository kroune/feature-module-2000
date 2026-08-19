package com.awesomeapp.f3impl

sealed class State725_7 {
    data object Loading : State725_7()
    data class Success(val data: String) : State725_7()
    data class Error(val message: String) : State725_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
