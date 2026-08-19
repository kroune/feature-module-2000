package com.awesomeapp.f329ui

sealed class State1690_7 {
    data object Loading : State1690_7()
    data class Success(val data: String) : State1690_7()
    data class Error(val message: String) : State1690_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}
